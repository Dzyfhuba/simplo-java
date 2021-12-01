/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author dzyfhuba
 */
public class Main extends JFrame implements ActionListener {

    static JTextField text_field;

    public Main() {
        Main.text_field = new JPasswordField();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main f = new Main();

        JButton button_a = new JButton("A");
        button_a.setBounds(5, 5, 100, 50);
        f.add(button_a);

        JButton button_b = new JButton("B");
        button_b.setBounds(110, 5, 100, 50);
        f.add(button_b);

        button_a.addActionListener((ActionEvent e) -> {
            Main.text_field.setText("A");
        });

        button_b.addActionListener(f);

        Main.text_field.setBounds(5, 70, 200, 50);
        f.add(Main.text_field);

        Main.text_field.setText("javatpoint.com");
        f.setResizable(false);
        f.setLayout(null);
        f.setTitle("Ini Judulnya");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(5, 5, 600, 300);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Main.text_field.setText("B");
    }

}
