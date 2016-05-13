package view;

import controller.ExpenseController;
import controller.LoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arun Tamang on 5/9/2016.
 */

public class ExpenseList extends JFrame{

  JFrame f1;
    JLabel lblfood,lblrent,lbleducation,lbltransportation,lbltravel,lblextra,lblgetdate,lblshopping;
    JTextField txtgetdate, txtfood,txtrent,txteducation,txttransportation,txttravel,txtextra,txtshopping;
    JButton btnClose,btnSave,btnDelete,btnUpdate,btnView;
    JPanel p1,p2;
    GridLayout gl62,gl21;
    FlowLayout fl;
    //contructor starts
    ExpenseList()
    {
        this.dispose();
        f1=new JFrame("Expense Lists");
        lblgetdate=new JLabel("date:");
        lblfood=new JLabel("Food:");
        lblshopping=new JLabel("shopping:");
        lblrent=new JLabel("Rent:");
        lbleducation=new JLabel("Education:");
        lbltransportation=new JLabel("Transportation:");
        lbltravel = new JLabel("Travel:");
        lblextra = new JLabel("Extra:");

        txtgetdate=new JTextField(50);
        txtfood=new JTextField(50);
        txtshopping=new JTextField(50);
        txtrent=new JTextField(50);
        txteducation=new JTextField(50);
        txttransportation=new JTextField(50);
        txttravel = new JTextField(50);
        txtextra = new JTextField(50);

        btnClose=new JButton("Close");
       // btnSave=new JButton("Save");
        //btnDelete=new JButton("Delete");
        //btnUpdate=new JButton("Update");
        btnView=new JButton("View");
        btnSave=new JButton("Save");

        p1=new JPanel();
        p2=new JPanel();

        gl62=new GridLayout(8,2);
        gl21=new GridLayout(2,1);
        fl=new FlowLayout();

        p1.setLayout(gl62);
        p1.add(lblgetdate);
        p1.add(txtgetdate);
        p1.add(lblfood);
        p1.add(txtshopping);
        p1.add(lblshopping);
        p1.add(txtfood);
        p1.add(lblrent);
        p1.add(txtrent);
        p1.add(lbleducation);
        p1.add(txteducation);
        p1.add(lbltransportation);
        p1.add(txttransportation);
        p1.add(lbltravel);
        p1.add(txttravel);
        p1.add(lblextra);
        p1.add(txtextra);

        p2.setLayout(fl);

        //p2.add(btnSave);
       // p2.add(btnUpdate);
       // p2.add(btnDelete);
        btnSave.setBounds(240,80,100,20);
        btnView.setBounds(340,80,100,20);
        btnClose.setBounds(440,80,100,20);

        p2.add(btnSave);
        p2.add(btnView);
        p2.add(btnClose);

        f1.setLayout(gl21);
        f1.add(p1);
        f1.add(p2);
        f1.setSize(500, 500);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);



        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getdate = txtgetdate.getText();
                String food = txtfood.getText();
                String shopping = txtshopping.getText();
                String rent = txtrent.getText();
                String education = txteducation.getText();
                String transportation = txttransportation.getText();
                String travel = txteducation.getText();
                String extra = txtextra.getText();
                new ExpenseController().Insert(getdate, food, shopping, rent, education, transportation, travel, extra);
                f1.dispose();
                new ExpenseList();

            }
        });
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
            }
        });
        btnView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new Report("Expense List report:").createTableView();
            }
        });


    }//Contructor Ends

}

