
package calcluter3;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Jmybutton extends JButton {
    Color m;
    public Jmybutton(){
        m= new Color(70,130,180);
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.white);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
     public Jmybutton(String n){
        m= Color.BLACK;
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.white);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(m);
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 0, 0);
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g){
        g.setColor(Color.blue);
        g.drawRoundRect(0, 0, getWidth(), getHeight(),0, 0);
    }
    
}
