/**
 * Created by Mayakov Stanislav on 30.03.2017.
 */
package SwingUsing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ThirdPane {
    private JPanel panel;
    private JTextField textField;
    private JButton button1;
    private JRadioButton[] radioButton;
    private ButtonGroup buttonGroup;
    private Border border;

    public ThirdPane() {
        panel = new JPanel();
        panel.setBackground( Color.cyan );
        panel.setForeground( Color.orange );

        textField = new JTextField();


        button1 = new JButton("Choose");
        button1.setBackground( Color.BLACK );
        button1.setForeground( Color.orange );

        border = BorderFactory.createTitledBorder("Subject №3");

        buttonGroup = new ButtonGroup();
        radioButton = new JRadioButton[3];
        panel.setBorder(border);
        panel.setLayout(new FlowLayout());

        textField = new JTextField(13);
        textField.setForeground( Color.PINK );
        textField.setBackground( Color.gray );



        for( int i=0; i<radioButton.length; i++ ) {
            radioButton[i] = new JRadioButton( Integer.toString(i + 1) );
            buttonGroup.add(radioButton[i]);
            panel.add(radioButton[i]);


        }

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                int intStr = Integer.parseInt( str );
                int LengthBlock = radioButton.length;
                boolean Checked = false;
                String BugButton = "";

                for ( int i = 0; i < LengthBlock; i++ ) {
                    BugButton = textField.getText();
                    if (radioButton[i].getText().equals(str)) {
                        if (!radioButton[i].isSelected()) {
                            Checked = true;
                            radioButton[i].setSelected(true); break;
                        } else {
                            Checked = true;
                            JOptionPane.showMessageDialog(panel, "Already chosen",
                                    "Dialog window", JOptionPane.INFORMATION_MESSAGE);
                        } break;
                    } continue;

                }
                if( !Checked){
                    JOptionPane.showMessageDialog(panel, "Button \" "  + BugButton + " \" don't exist ",
                            "Dialog window", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(textField);
        panel.add(button1);
    }

    public JPanel display() {
        return panel;
    }
}
