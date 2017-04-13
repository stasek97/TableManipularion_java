/**
 * Created by Mayakov Stanislav on 30.03.2017.
 */
package SwingUsing;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FifthPane
{   int i=0;
    private JLabel Lab = null;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextField textField;
    private JTable table;
    private JScrollPane scrollPane;
    private Border border;
    public  FifthPane()
    {
        Lab = new JLabel();
        Lab.setPreferredSize(new Dimension(750, 10));
        Lab.setBackground( Color.ORANGE );
        Lab.setForeground( Color.PINK );

        Object[][]cells = new Object[10][10];
        String[] colonumNames =
                {
                        "1 row ", "2 column "
                };

        panel = new JPanel();
        panel.setBackground( Color.cyan );
        panel.setForeground( Color.orange );
        panel.setPreferredSize(new Dimension(750,500));

        textField = new JTextField(15);
        textField.setBackground( Color.blue );
        textField.setForeground( Color.magenta );

        button1 = new JButton("Add in table");
        button1.setBackground( Color.BLACK );
        button1.setForeground( Color.orange );

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s=textField.getText();
                table.setValueAt(s,i++,0);

            }
        });





        button2 = new JButton("To second from first");
        button2.setBackground( Color.BLACK );
        button2.setForeground( Color.orange );

        button3 = new JButton("To first from second");
        button3.setBackground( Color.BLACK );
        button3.setForeground( Color.orange );

        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (table.getValueAt(table.getSelectedRow(),table.getSelectedColumn())==null)
                    JOptionPane.showMessageDialog(panel,"This cell haven't include meaning","Dialog window",JOptionPane.WARNING_MESSAGE);
                else{
                    table.setValueAt(table.getValueAt(table.getSelectedRow(),table.getSelectedColumn()), table.getSelectedRow(), table.getSelectedColumn()+1);
                    table.setValueAt(null, table.getSelectedRow(),table.getSelectedColumn());
                }

            }
        });

        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (table.getValueAt(table.getSelectedRow(),table.getSelectedColumn())==null)
                    JOptionPane.showMessageDialog(panel,"This cell haven't include meaning","Dialog window",JOptionPane.WARNING_MESSAGE);

                else{
                    table.setValueAt(table.getValueAt(table.getSelectedRow(),table.getSelectedColumn()), table.getSelectedRow(), table.getSelectedColumn()-1);
                    table.setValueAt(null, table.getSelectedRow(),table.getSelectedColumn());
                }

            }
        });

        border = BorderFactory.createTitledBorder("");

        panel.setBorder(border);

        table = new JTable(cells,colonumNames);
        table.setBackground(Color.pink);
        table.setForeground( Color.darkGray);

        scrollPane = new JScrollPane(table);

        Box box = Box.createVerticalBox();
        panel.setLayout(new FlowLayout());
        panel.setBackground( Color.cyan );
        panel.setForeground( Color.orange );
        panel.add(Lab);
        panel.add(scrollPane);
        panel.add(box);

        box.add(button1);
        box.add(button2);
        box.add(button3);
        box.add(textField);
    }

    public JPanel display()
    {
        return panel;
    }

}
