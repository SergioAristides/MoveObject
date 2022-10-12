/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoveImage;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author sergi
 */
public class Window extends JFrame {

    public Window() {
        this.setSize(800,600);
        add(new Dibujar());
        this.setTitle("Move object");
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        Window window= new Window();
        
    }
    
}
