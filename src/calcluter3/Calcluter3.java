
package calcluter3;

import java.awt.Color;
import java.awt.Image;
import java.io.File;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Calcluter3 {
 
    public static void main(String[] args) {
       form f =new form();
       f.getContentPane().setBackground(Color.white);
       f.setVisible(true);
     
     
    
      f.setBounds(520, 220, 255, 330);
       
        try {
            File o= new File("dna1.png");
           Image s =ImageIO.read(o);
            f.setIconImage(s);
          
        } catch (Exception ex) {
            Logger.getLogger(Calcluter3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}