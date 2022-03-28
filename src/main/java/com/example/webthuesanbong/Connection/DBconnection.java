package com.example.webthuesanbong.Connection;
//
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;


public class DBconnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/qlsanbong";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "Aa@123";
    public static Connection getConnecttion() {
        Connection cons = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
//            cons =DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsanbong","root","Aa@123");
            System.out.println("connect successfully!");
//            jquery
//            Statement statement = cons.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from tai_khoan");
//            while (resultSet.next()){
//                System.out.println(resultSet.getString("username"));
//            }
        } catch (Exception e) {
            System.out.println("connect failure!");
            e.printStackTrace();
        }
        return cons;
    }
    public static void main(String[] args) {
        System.out.println(getConnecttion());

    }
}
