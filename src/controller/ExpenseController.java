package controller;

import dataBaseConnection.DbConnection;
import model.Expense;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Arun Tamang on 5/12/2016.
 */
public class ExpenseController {
    private Connection connection = null;
    private Statement statement = null;



    public ExpenseController(){
        connection = new DbConnection().getConn();
    }
    public void Insert(String getdate, String food, String shopping,String rent, String education, String transportation, String travel, String extra) {
        try {
            statement = connection.createStatement();

            String query = "insert into expense values( NULL ,'" + getdate + "', '" + food + "', '" + shopping + "','" + rent + "','" + education + "','" + transportation + "','" + travel + "','" + extra + "')";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "data is recorded Successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Expense> display(){
    List<Expense> expenseList = new LinkedList<Expense>();
        try{
            Statement statement = connection.createStatement();

            String select_query = "SELECT *FROM expense";

            ResultSet resultSet = statement.executeQuery(select_query);

            while (resultSet.next()){
                 Expense expense = new Expense();

                expense.setGetdate(resultSet.getString("getdate"));
                expense.setFood(resultSet.getString("food"));
                expense.setShopping(resultSet.getString("shopping"));
                expense.setRent(resultSet.getString("rent"));
                expense.setEducation(resultSet.getString("education"));
                expense.setTransportation(resultSet.getString("transportation"));
                expense.setTravel(resultSet.getString("travel"));
                expense.setExtra(resultSet.getString("extra"));

               expenseList.add(expense);
            }


        }catch (SQLException e){
            e.printStackTrace();
        }

        return expenseList;
    }
}
