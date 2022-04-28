package com.company;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;

public class WprowadzKlientke  extends JDialog
{
    public WprowadzKlientke (JFrame parent)
    {
        super (parent, true);
        initComponents ();

        int szer = (int)parent.getBounds().getWidth();
        int wys = (int)parent.getBounds().getHeight();

        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;

        this.setLocation(parent.getBounds().x+(szer-szerRamki)/2, parent.getBounds().y+(wys-wysRamki)/2);
    }
    public void initComponents () {
        this.setTitle("Klientka");
        this.setBounds(300, 400, 600, 400);

        zapisz.addActionListener(e -> {
            String [] opcje = {"Tak", "Nie"};
            int rc = JOptionPane.showOptionDialog(
                    null,
                    "Czy chcesz zapisać?",
                    null,
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcje,
                    opcje[1]);
            System.out.println("WYbrałeś" + rc + " " + opcje[rc]);
        });
        panelZapisz.add(zapisz);

        comboBox.addItem("Tak");
        comboBox.addItem("Nie");
        comboBox.addItem("I rata - opłacona");
        comboBox.addItem("II rata- opłacona");
        pay.setCellEditor(new DefaultCellEditor(comboBox));

        this.getContentPane().add(scrollPane);
        this.getContentPane().add(panelZapisz, BorderLayout.PAGE_END);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private final JPanel panelZapisz = new JPanel();
    private final JButton zapisz = new JButton("Zapisz");
    final String[] columnNames = {"Numer", "Data wprowadzenia", "Nazwisko", "Imię", "Cel", "Waga początkowa", "Dieta","Zapłacono"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 2);
    JTable tab = new JTable(model);
    JScrollPane scrollPane = new JScrollPane(tab);

    TableColumn pay = tab.getColumnModel().getColumn(7);
    JComboBox<String> comboBox = new JComboBox<>();

    public static void main(String[] args)
    {
        new Main ().setVisible(true);
    }

}