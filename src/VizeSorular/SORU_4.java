/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VizeSorular;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class SORU_4 extends JPanel{
    
     private final int max = 64; //max sınır degiskeni
    private JPanel[] panels = new JPanel[max]; //max kadar panel nesnesi olusturduk
    private Color renk1 = Color.BLACK; // initial renk1
    private Color renk2 = Color.WHITE;//initial renk2
    private Color temp; // swap degiskeni
    
    SORU_4()
    {
        code();
    }
    
    public void code(){
        setLayout(new GridLayout(8,8)); // 8x8 lik grid layout
        for (int i = 0; i < max; i++) {
            panels[i] = new JPanel();
            if ((i % 8) == 0) {
                temp = renk1;
                renk1 = renk2;
                renk2 = temp;
            }
            if (i % 2 == 0) {
                panels[i].setBackground(renk1);
            } else {
                panels[i].setBackground(renk2);
            }
            add(panels[i]);
        }
        
    }

    private void setLayout(GridLayout gridLayout) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
