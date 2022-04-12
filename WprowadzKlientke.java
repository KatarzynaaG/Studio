package com.company;
import javax.swing.*;
import java.awt.*;


public class WprowadzKlientke extends JDialog
{

        public WprowadzKlientke (JFrame parent)
        {
            super (parent, true);
            initComponents ();

            int szer = (int)parent.getBounds().getWidth();
            int wys = (int)parent.getBounds().getHeight();

            //this.setSize(szer/10, wys/4);

            int szerRamki = this.getSize().width;
            int wysRamki = this.getSize().height;

            this.setLocation(parent.getBounds().x+(szer-szerRamki)/2, parent.getBounds().y+(wys-wysRamki)/2);
        }

        public void initComponents ()
        {
            this.setTitle("Klientka");
            this.setBounds(300, 300, 350, 250);


            panelZapisz.add(zapisz);


            this.getContentPane().add(suwak);
            this.getContentPane().add(tab);
            this.getContentPane().add(panelZapisz, BorderLayout.PAGE_END);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }


        private JPanel panelZapisz = new JPanel();
        private JButton zapisz = new JButton("Zapisz");
        private JTable tab = new JTable(2,5);
        private JScrollPane suwak = new JScrollPane();




        public static void main(String[] args)
        {
            new Main ().setVisible(true);
        }

    }


