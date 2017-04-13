/**
 * Created by Mayakov Stanislav on 15.03.2017.
 */
package SwingUsing;

import TimeColorsChanges.OnceUponATime;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.lightGray;
public class main  {
    private JFrame jfrm;
    public main (String str) {

        jfrm = new JFrame("Work №1");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(500,400);
        jfrm.getContentPane().setBackground( lightGray );
        jfrm.setLocationRelativeTo(null);
        jfrm.setLayout(new FlowLayout());
        jfrm.add( new FirstPane().display() );
        jfrm.add( new SecondPane().display() );
        jfrm.add( new ThirdPane().display() );
        jfrm.add( new FouthPane().display() );
        jfrm.add( new FifthPane().display() );
        jfrm.add( new OnceUponATime().display() );
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( new Runnable() {
            @Override
           public void run() {
                new main("New Program");
                new OnceUponATime();
            }
        });
   }
}
