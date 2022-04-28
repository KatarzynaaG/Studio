package com.company;
import javax.swing.*;
import java.awt.*;

public  class Main extends JFrame
{

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
    podMenu.addActionListener(e -> {
    menuFile.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    new WprowadzKlientke(frame).setVisible(rootPaneCheckingEnabled);
    });
    menuFile.addSeparator();
    JMenuItem lista = menuFile.add(new JMenuItem("Lista klientek"));
    lista.addActionListener(e -> {
        menuFile.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
       new lista(frame).setVisible(rootPaneCheckingEnabled);
    });
    menuFile.addSeparator();
    JMenuItem archiwizacja = menuFile.add(new JMenuItem("Zarchiwizowane"));
    archiwizacja.addActionListener(e -> archiwizacja.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)));
    JMenuItem usuniete = menuFile.add(new JMenuItem("Usunięte"));
    usuniete.addActionListener(e -> usuniete.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)));
        clik.addActionListener(e -> {
            clik.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            new WprowadzKlientke(frame).setVisible(rootPaneCheckingEnabled);
        });
        list.addActionListener(e -> {
            list.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
          new lista (frame).setVisible(rootPaneCheckingEnabled);
        });
    panelClik.add(clik);
    panelClik.add(list);

    this.getContentPane().add(panelClik);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private final JFrame frame = this;
    private final JMenuBar menu =  new JMenuBar();
    private final JPanel panelClik = new JPanel();
    private final JButton clik = new JButton("Dodaj");
    private final JButton list = new JButton("Lista klientek");

        public static void main (String[]args)
        {
            new Main ().setVisible(true);
        }

            }

    
