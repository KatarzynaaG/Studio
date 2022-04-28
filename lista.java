package com.company;
import javax.swing.*;
import java.awt.*;

public class lista extends JDialog
{
    public lista(JFrame parent)
    {
        super(parent);
        initComponents();
    }

    public void initComponents ()
    {
        this.setTitle("Lista klientek");
        this.setBounds(300,300,300,300);

    panel2.add(zarch);
    panel2.add(del);

        this.getContentPane().add(panel2, BorderLayout.PAGE_END);
    }
    private final JPanel panel2 = new JPanel();
    private final JButton zarch = new JButton("Zarchiwizuj");
    private final JButton del = new JButton("Usuń");


}

