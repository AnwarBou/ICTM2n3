package ICTM2n3.Menu.java;

import javax.swing.*;

public class Menu {
    JFrame a = new JFrame("buttons");
    JButton b = new JButton("ontwerp maken");
    JButton c = new JButton("ontwerp openen");
    JButton d = new JButton("component toevoegen");
    JButton e = new JButton("bereken goedkoopste infra-ontwerp");
    JButton f = new JButton("serverstatus");
    b.setBounds(350, 250, 100, 30);
    c.setBounds(350, 285, 100, 30);
    d.setBounds(350, 320, 150, 30);
    e.setBounds(350, 355, 250, 30);
    f.setBounds(350, 390, 90, 30);
    a.add(b,c,d,e,f);
    f.setSize(800,600);
    f.setLayout(null);
    f.setVisible(true);
}