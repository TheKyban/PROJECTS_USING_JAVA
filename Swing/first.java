package Swing;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class first {
    public static void main(String[] args) {
        /* **********JFrame********** */
        JFrame ff = new JFrame();
        ff.setVisible(true);
        ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ff.setSize(300,400);
        // ff.setLocation(600,100);
        ff.setBounds(600,100,300,400); // use setSize and SetLocation together

        ImageIcon icon = new ImageIcon("Swing/cal_icon.png");
        ff.setIconImage(icon.getImage());

        Container c =  ff.getContentPane();
        c.setLayout(null);

        Color color = new Color(139, 245, 250);
        // c.setBackground(color);

        ff.setResizable(false);

        /***************************/

        /*******************JLebel***************/
        JLabel user = new JLabel();
        user.setText("user");
        user.setBounds(100,50,30,30);
        // user.setVisible(true);
        c.add(user);
        /***************************************/
    }
}
   