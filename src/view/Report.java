package view;

import controller.ExpenseController;
import model.Expense;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arun Tamang on 5/12/2016.
 */
public class Report extends JFrame implements ActionListener{
    JPanel panel;
    String name;
    JTable reportTable;
    JButton print,deleteCustomer,editCustomer,homeBtn;

    public Report(String name){
        super(name);
    }
    public void createTableView()
    {
       // add(new Header(width,height).returnHeader(), BorderLayout.NORTH);

        String[] columnNames = {"Date","Food","Shopping","Rent","Education","Transportation","Travel","Extra"};

        Object[][] data= new Object[new ExpenseController().display().size()][8];

        int i = 0;
        for (Expense expense:new ExpenseController().display()){

            data [i][0]= expense.getGetdate();
            data [i][1]= expense.getFood();
            data [i][2]= expense.getShopping();
            data [i][3]= expense.getRent();
            data [i][4]= expense.getEducation();
            data [i][5]= expense.getTransportation();
            data [i][6]= expense.getTravel();
            data [i][7]= expense.getExtra();
            i++;
        }
        reportTable = new JTable(data,columnNames);
        reportTable.setPreferredScrollableViewportSize(new Dimension(700,500));
        reportTable.setFillsViewportHeight(true);

        JScrollPane jScrollPane = new JScrollPane(reportTable);

        print = new JButton("Report Print");
        homeBtn  = new JButton("Logout");
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(700, 500));
        panel.add(jScrollPane);
        panel.add(print);
        panel.add(homeBtn);
        add(panel, BorderLayout.CENTER);

       // add(new Footer(width, height).returnFooter(), BorderLayout.SOUTH);

        //print.addActionListener(this);
        //homeBtn.addActionListener(this);
        setVisible(true);
        setSize(700,700);
        this.setLocationRelativeTo(null);
        homeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new LoginPage(name);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
