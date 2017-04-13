/**
 * Created by Mayakov Stanislav on 16.03.2017.
 */
package SwingUsing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FirstPane  {
     JPanel panel;
    private JTextField textField;
    private JButton button1;
    private JComboBox comboBox;
    private Border border;
    public FirstPane()
    {
        panel = new JPanel();
        panel.setBackground( Color.cyan );
        panel.setForeground( Color.orange );


        button1 = new JButton("Add");
        button1.setBackground( Color.BLACK );
        button1.setForeground( Color.DARK_GRAY );

        border = BorderFactory.createTitledBorder("Subject№1");
        panel.setBorder( border );

        panel.setLayout( new FlowLayout() );
        panel.setForeground( Color.BLUE );
        panel.setBackground( Color.cyan );

        textField = new JTextField(15 );
        textField.setForeground( Color.PINK );
        textField.setBackground( Color.gray );

        comboBox = new JComboBox();
        comboBox.setBackground( Color.green );
        comboBox.setForeground( Color.orange );

        button1.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e ) {
                String str = textField.getText();
                int i = 0;
                for(  i = 0; i < comboBox.getItemCount(); i++) {
                    if( str.equals(comboBox.getItemAt(i)) ) {
                        JOptionPane.showMessageDialog(panel, "Already added", "Dialog window", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                }

                if( i == comboBox.getItemCount() )
                    comboBox.addItem(str);
            }

        });
        panel.add( textField );
        panel.add( button1 );
        panel.add( comboBox );

    }

    public JPanel display()
    {
        return panel;
    }

}


