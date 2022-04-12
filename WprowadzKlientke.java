package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        public void initComponents () {
            this.setTitle("Klientka");
            this.setBounds(300, 400, 600, 400);

           /* wybor.setCurrentDirectory(new File(System.getProperty("user.dir")));
            wybor.setMultiSelectionEnabled(false);
            wybor.setAcceptAllFileFilterUsed(true);*/

            zapisz.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            String [] columnNames = {"Data wprowadzenia", "Nazwisko", "Imię", "Cel", "Waga początkowa", "Dieta"};
            Object [][] data = new Object [1][6];
            JTable tab = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(tab);
            tab.setFillsViewportHeight(true);


            panelZapisz.add(zapisz);

            this.getContentPane().add(scrollPane);
            this.getContentPane().add(panelZapisz, BorderLayout.PAGE_END);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

        private final JPanel panelZapisz = new JPanel();
        private final JButton zapisz = new JButton("Zapisz");
        private final JFileChooser wybor = new JFileChooser();


        public static void main(String[] args)
        {
            new Main ().setVisible(true);
        }

    }


