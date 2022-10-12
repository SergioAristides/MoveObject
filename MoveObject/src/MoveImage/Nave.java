/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoveImage;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

/**
 *
 * @author sergi
 */
public class Nave implements KeyListener {
    private String nave= "nave.gif";
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    public Nave() {
        x=40;
        y=60;
        ImageIcon img = new ImageIcon(this.getClass().getResource(nave));
        
        image= img.getImage();
    }
    
    public void mover(){
        this.x+=dx;
        this.y+=dy;
        
    }
    public int tenerx(){
        return x;
    }
    public int tenery(){
        return y;
    }
    public Image tenerImage(){
        return image;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        if(x>10){
            if(key==e.VK_LEFT){
            dx=-1;
            }
            System.out.println(this.x+"xIzquierda");
        }
        if(x<600){
             if(key==e.VK_RIGHT){
            dx=1;
        }
              System.out.println(this.x+"xderecha");
            
        }
       
        if(y>10){
             if(key==e.VK_UP){
            dy=-1;
             }
             System.out.println(this.y+"yArriba");
        }
       if(y<398){
            if(key==e.VK_DOWN){
            dy=1;
           }
             System.out.println(this.y+"yAbajo");
        
           
       }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
         int key=e.getKeyCode();
        
        if(key==e.VK_LEFT){
            dx=0;
        }
        if(key==e.VK_RIGHT){
            dx=0;
        }
        if(key==e.VK_UP){
            dy=0;
        }
        if(key==e.VK_DOWN){
            dy=0;
        }
        
    }
    
    
    
    
     
    
}
