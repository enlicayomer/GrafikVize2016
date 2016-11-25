/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VizeSorular;

import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class anaClass extends JFrame{

    SORU_2 soru2=new SORU_2();
    public anaClass() {
    
    initUI();
    }
    
    public void initUI()
    {
        setTitle("2016-2017 vize");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        //add(new SORU_1(getWidth(),getHeight()));
       add(new SORU_2());
       // add(new SORU_3());
        //add(new SORU_4());
        
        
    }
    
    public static void main(String[] args)
    {
        new anaClass();
    }
    
    
    
}
