package view;

import controller.LoginController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arun Tamang on 4/28/2016.
 */
class LoginPage extends JFrame implements ActionListener {
    JButton btnlogin,btnexit;
    JTextField jfuser;
    JPasswordField jpfpass;
    JLabel jlabuser,jlabpass;
    public LoginPage(String name){
        super(name);
        btnlogin = new JButton("Login");
    /*    btnrest = new JButton("Reset");*/
        btnexit = new JButton("Exit");
        jfuser = new JTextField();
        jpfpass = new JPasswordField();
        jlabuser = new JLabel("userName:");
        jlabpass = new JLabel("password:");

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnlogin.addActionListener(this);
       // btnrest.addActionListener(this);
        btnexit.addActionListener(this);

        jlabuser.setBounds(10,10,120,20);
        jlabpass.setBounds(10,50,120,20);
        jfuser.setBounds(140,10,300,20);
        jpfpass.setBounds(140,50,300,20);

        btnlogin.setBounds(240,80,100,20);
        btnexit.setBounds(340,80,100,20);
//        btnexit.setBounds(340,55,100,20);

        this.add(jlabuser);
        this.add(jlabpass);
        this.add(jfuser);
        this.add(jpfpass);
        this.add(btnlogin);
       // this.add(btnrest);
        this.add(btnexit);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=jfuser.getText();
                String pass= new String(jpfpass.getPassword());
                LoginController login = new LoginController();

                if (login.check(name,pass)){
                    new ExpenseList();
                }else {
                    JOptionPane.showMessageDialog(null,"Login invalid");
                }
                setVisible(false);
            }
        });
        btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(1);
            }
        });
    }


    public void actionPerformed(ActionEvent ae) {
    }

    public static void main(String args[]){
        LoginPage loginPage = new LoginPage("Login Page");

    }
}

