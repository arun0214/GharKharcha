package controller;

import dataBaseConnection.DbConnection;

import javax.swing.*;
import java.sql.*;

/**
 * Created by Arun Tamang on 5/11/2016.
 */
public class LoginController {
    String username;
    String password;
    private Connection connection = null;
    private Statement statement = null;

    public LoginController(){
        connection= new DbConnection().getConn();
    }

    public boolean check(String username,String password){

        try{
            statement = connection.createStatement();
            String loginCheck = "SELECT *FROM user WHERE username='"+username+"'and password='"+password+"'";

            ResultSet resultSet = statement.executeQuery(loginCheck);
              while (resultSet.next()){
                     username = resultSet.getString("username");
                     password = resultSet.getString("password");
                     return true;
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    return false;
    }


}
