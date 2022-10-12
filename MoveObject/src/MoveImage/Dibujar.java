/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoveImage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author sergi
 */
public class Dibujar extends JPanel implements ActionListener {
    private Nave nave;
    private Timer timer;
    private Graphics g;

    public Dibujar() {
        
        nave= new Nave();
        this.setBackground(Color.WHITE);
        this.setFocusable(true);
        addKeyListener(nave);
        timer= new Timer(5,this);//--->maneja la velocidad del moved de la nave
        timer.start();
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;
        g2.drawImage(nave.tenerImage(), nave.tenerx(), nave.tenery(),200,200,this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        nave.mover();
        repaint();
        
    }
    
    
}
