package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {
    public Main() {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Aplikacja studio");
        this.setBounds(400, 400, 400, 300);
        this.setJMenuBar(menu);

    JMenu menuFile = menu.add(new JMenu("Plik"));

    JMenuItem podMenu = menuFile.add(new JMenuItem("Dodaj"));
    podMenu.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        menuFile.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        new WprowadzKlientke(frame).setVisible(rootPaneCheckingEnabled);

        }
    });
    menuFile.addSeparator();
    JMenuItem lista = menuFile.add(new JMenuItem("Lista klientek"));
    lista.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            menuFile.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            new lista(frame).setVisible(rootPaneCheckingEnabled);

        }
    });
    JMenuItem archiwizacja = menuFile.add(new JMenuItem("Zarchiwizowane"));
    archiwizacja.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            archiwizacja.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    });
        clik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clik.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                new WprowadzKlientke(frame).setVisible(rootPaneCheckingEnabled);
            }
        });
        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                new lista(frame).setVisible(rootPaneCheckingEnabled);
            }
        });

    panelClik.add(clik);
    panelClik.add(list);



    this.getContentPane().add(panelClik);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    private JFrame frame = this;
    private final JMenuBar menu =  new JMenuBar();
    private JPanel panelClik = new JPanel();
    private JButton clik = new JButton("Dodaj");
    private JButton list = new JButton("Lista klientek");


        public static void main (String[]args)
        {
            new Main ().setVisible(true);
        }
    }
