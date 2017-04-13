/**
 * Created by Mayakov Stanislav on 30.03.2017.
 */
package SwingUsing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FouthPane
{
    private JPanel panel;
    private JTextField textField;
    private JButton button1;
    private JCheckBox[] checkBoxes;
    private Border border;
    public FouthPane()
    {
        panel = new JPanel();
        panel.setBackground( Color.cyan );
        panel.setForeground( Color.orange );

        checkBoxes = new JCheckBox[3];

        textField = new JTextField(13);
        textField.setForeground( Color.RED );
        textField.setBackground( Color.GREEN);

        button1 = new JButton("Choose");
        button1.setBackground( Color.BLACK );
        button1.setForeground( Color.orange );

        border = BorderFactory.createTitledBorder("Subject №4");
        panel.setBorder(border);
        panel.setLayout( new FlowLayout() );
        for(int i = 0; i < checkBoxes.length; i++)
        {
            checkBoxes[i] = new JCheckBox( Integer.toString(i + 1) );
            panel.add(checkBoxes[i]);
        }
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String str = textField.getText();
                boolean Checked = false;
                for(int i = 0; i < checkBoxes.length; i++)
                {

                    if( str.equals( checkBoxes[i].getText() ) )
                    {
                        if(  checkBoxes[i].isSelected() ) {
                            checkBoxes[i].setSelected(false); break;
                        }
                        checkBoxes[i].setSelected(true);
                        Checked = true;
                        break;
                    }
                }
                if(!Checked)
                    JOptionPane.showMessageDialog(panel,"Button CheckBox with this name haven't exist","Dialog window",
                            JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(textField);
        panel.add(button1);
    }

    public JPanel display()
    {
        return panel;
    }
}
