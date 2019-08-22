package Controller;

import UI.MainForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ContactForm extends JFrame {

    private JPanel RootPanelContForm;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonCancel;
    private JButton buttonSave;

    public ContactForm (){
        setContentPane(RootPanelContForm);
        setSize(500,250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2,dim.height/2-getSize().height/2);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        setListerns();
    }

    private void setListerns (){

        buttonCancel.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new MainForm();
                dispose();
            }
        });

        buttonSave.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Item Gravado Com sucesso");
            }
        });
    }
}
