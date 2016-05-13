package dataBaseConnection;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Arun Tamang on 5/11/2016.
 */
public class DbConnection {
    private  String driver ="com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/gharkharcha";
    private String username ="root";
    private String password ="";
    private Connection connection = null;

    public DbConnection(){
        try{
            Class.forName(driver);
            try {
                connection= DriverManager.getConnection(url,username,password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
           //
           // System.out.println("successfully connected");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public  Connection getConn(){
     return connection;
    }


}
