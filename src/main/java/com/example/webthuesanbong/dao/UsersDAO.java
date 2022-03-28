package com.example.webthuesanbong.dao;
import com.example.webthuesanbong.Connection.DBconnection;
import com.example.webthuesanbong.model.Users;

import java.sql.*;

public class UsersDAO {
    Connection cons ;
    ResultSet rs = null;

    public UsersDAO() {
        this.cons = cons;
    }

    //for register user
    public boolean saveUser(Users user){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into user(username,Email,password) values(?,?,?)";

            PreparedStatement pt = cons.prepareStatement(query);
            pt.setString(1, user.getUsername());
            pt.setString(2, user.getEmail());
            pt.setString(3, user.getPassword());

            pt.executeUpdate();
            set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
//    login
    public Users Login(String Email, String password)
    {
        String query = "SELECT * FROM tai_khoan WHERE Email = ? AND password=?";
        try {
            cons = new DBconnection().getConnecttion();
            PreparedStatement pt = cons.prepareStatement(query);
            pt.setString(1, Email);
            pt.setString(2, password);
            rs = pt.executeQuery();
//
            while(rs.next()){
                return new Users(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//    check account
    public Users checkAccountExits(String username)
    {
        String query = "SELECT * FROM tai_khoan WHERE username = ?";
        try {
            cons = new DBconnection().getConnecttion();
            PreparedStatement pt = cons.prepareStatement(query);
            pt.setString(1, username);
            rs = pt.executeQuery();
    //
            while(rs.next()){
                return new Users(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//    signup
    public  void Signup(String username, String password, String email){
        String query = "INSERT INTO tai_khoan(username, email, password) VALUES(?, ?, ?)";
        try {
            cons = new DBconnection().getConnecttion();
            PreparedStatement pt = cons.prepareStatement(query);
            pt.setString(1, username);
            pt.setString(2, email);
            pt.setString(3, password);
            pt.executeUpdate();
            //7

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
