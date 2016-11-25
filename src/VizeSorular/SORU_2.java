/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VizeSorular;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author admin
 */
public class SORU_2 extends JPanel implements ActionListener {

    public int x, y;
    Timer timer = new Timer(10, this);

    SORU_2() {
        timer.start();

         addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e)
            {
                mouse1(e);
                System.out.println(e.getX());
            }
        });
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(final MouseEvent e) {
                mouse2(e);
            }
        });
    }

    public void kutuCiz(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 30, 30);
        g.setColor(Color.red);
        g.fillRect(x, y, 30, 30);
    }
public void temizle(Graphics g)
{
     if (ui != null) {
            Graphics scratchGraphics = (g == null) ? null : g.create();
            try {
                ui.update(scratchGraphics, this);
            }
            finally {
                scratchGraphics.dispose();
            }
        }
}
    @Override
    public void paintComponent(Graphics g) {
        temizle(g);
        kutuCiz(g);
    }

    
   
    public void mouse1(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
    }

    public void mouse2(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
    }
}
