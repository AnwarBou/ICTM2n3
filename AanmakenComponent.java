package ICTM2n3.AanmakenComponent.java;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * DialoogScherm
 */
public class AanmakenComponent extends JFrame implements ActionListener {
    private JButton jbToevoegen;
    private JTextField jtPrijs, jtType, jtBeschikbaarheid;

    public DialoogScherm(){
        setTitle("NerdyGadgets Component Toevoegen");
        setSize(800, 600);
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jbToevoegen = new JButton("Inloggen");
        jlPrijs = new JLabel("Prijs");
        jlType = new JLabel("Type");
        jlBeschikbaarheid = new JLabel("Beschikbaarheid");
        jtPrijs = new JTextfield();
        jtType = new JTextfield();
        jtBeschikbaarheid = new JTextfield();

        add(jlPrijs);
        add(jtPrijs); 
        add(jlType);
        add(jtType);
        add(jlBeschikbaarheid);
        add(jtBeschikbaarheid);
        add(jbToevoegen);

        jbToevoegen.addActionListener(this);;

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == jbToevoegen){

    }
}