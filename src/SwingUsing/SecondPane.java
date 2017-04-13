/**
 * Created by Mayakov Stanislav on 30.03.2017.
 */
package SwingUsing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPane implements ActionListener  {
    private JPanel panel;
    private JTextField textField;
    private JButton button1;
    private JButton button2;
    private Border border;
    public SecondPane() {
        panel = new JPanel();
        panel.setBackground( Color.cyan );
        panel.setForeground( Color.orange );

        border = BorderFactory.createTitledBorder( "Subject №2" );
        panel.setBorder( border );

        panel.setLayout( new FlowLayout() );

        textField = new JTextField(15);
        textField.setForeground( Color.PINK );
        textField.setBackground( Color.BLUE );

        button1 = new JButton("Add");
        button1.setBackground( Color.BLACK );
        button1.setForeground( Color.orange );

        button2 = new JButton("SWAP");
        button2.setBackground( Color.blue );
        button2.setForeground( Color.DARK_GRAY );

        button1.addActionListener(this );
        button2.addActionListener(this );

        panel.add( textField );
        panel.add( button1 );
        panel.add( button2 );
    }

    @Override
    public void actionPerformed(ActionEvent event ) {
           String str = "";
           if(  event.getActionCommand().equals( button1.getText() )  ) {
               button1.setText( textField.getText() );
           } else {
               button2.setText( button1.getText() );
               button1.setText( button2.getText() );

           }
    }

    public JPanel display() {
        return panel;
    }

}
