package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame {
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable table1;
    private JPanel RootPanel;


    public MainForm() {
        setContentPane(RootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dimn = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dimn.width / 2 - getSize().width/2 , dimn.height/2 - getSize().height/2);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        setListerns ();
    }

    private void setListerns () {

        buttonNewContact.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new ContactForm();


            }
        });

        buttonRemove.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JOptionPane.showMessageDialog(null,"Contact Removed sucefull");
            }
        });
    }


}
