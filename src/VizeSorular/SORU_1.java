/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VizeSorular;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author admin
 */
public class SORU_1 extends JPanel implements ActionListener{
   int w,h;
   Random rand=new Random();
    int DELAY=200;
    Timer timer=new Timer(DELAY,this);
    String metin;
    int i=0;
    Color renk=new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
    Font font =new Font("Times new Roman",Font.BOLD+Font.PLAIN,200);
    SORU_1(int w, int h)
    {
        this.w=w;
        this.h=h;
        timer.start();
        System.out.println(w+" "+h);
        ifade("Cumhuriyet Universitesi",200);
    }
            
    public void ifade(String ifade,int zaman)
    {
        this.metin=ifade;
        this.DELAY=zaman;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        
        super.paintComponent(g);
        g.setColor(renk);
        g.setFont(font);
        String c=String.valueOf(metin.charAt(i));
        System.out.println(metin.charAt(i));
        g.drawString(c, w/2, h/2);
        i+=1;
        if(i==metin.length())
            i=0;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        repaint();
    }
}
