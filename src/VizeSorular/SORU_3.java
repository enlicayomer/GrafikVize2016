/**
 * 
 */
package VizeSorular;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author admin
 */
public class SORU_3 extends JPanel implements ActionListener {

    int x = 0, y = 0;
    int aci = 30;
    double radyan = aci * (Math.PI / 180);
    double xa = Math.cos(radyan) * 10;/*topun x hızı(10 değeri)*/
    double ya = Math.sin(radyan) * 10;

    Timer timer = new Timer(10, this);

    SORU_3() {
        timer.start();
    }

    public void topCiz(Graphics g) {
        g.fillOval(x, y, 50, 50);
    }

    public void hareket() {
        if (x + xa < 0) {
            xa *= -1;
        }

        if (x + xa > getWidth() - 50) {
            xa *= -1;
        }

        if (y + ya < 0) {
            ya *= -1;
        }
        if (y + ya > getHeight() - 50) {
            ya *= -1;
        }

        x += xa;
        y += ya;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        topCiz(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        hareket();
        repaint();

    }

//   
}
