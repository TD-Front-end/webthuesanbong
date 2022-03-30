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
            String query = "insert into chusan(MaChuSan, TenChuSan, Sdt, DiaChi, UserName, Password, Email) values(?,?,?,?,?,?,?)";

            PreparedStatement pt = cons.prepareStatement(query);
            pt.setInt(1, user.getMachusan());
            pt.setString(2, user.getTenchusan());
            pt.setString(3, user.getSdt());
            pt.setString(4, user.getDiachi());
            pt.setString(5, user.getUsername());
            pt.setString(6, user.getPassword());
            pt.setString(7, user.getEmail());

            pt.executeUpdate();
            set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
//    login
    public Users Login(String Username, String password)
    {
        String query = "SELECT * FROM chusan WHERE UserName = ? AND PassWord=?";
        try {
            cons = new DBconnection().getConnecttion();
            PreparedStatement pt = cons.prepareStatement(query);
            pt.setString(1, Username);
            pt.setString(2, password);
            rs = pt.executeQuery();
//
            while(rs.next()){
                return new Users(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//    check account
    public Users checkAccountExits(String username)
    {
        String query = "SELECT * FROM chusan WHERE UserName = ?";
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
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//    signup
    public  void Signup(int machusan, String tenchusan, String sdt, String diachi, String username, String password, String email){
        String query = "INSERT INTO chusan(MaChuSan, TenChuSan, Sdt, DiaChi ,UserName, PassWord, Email) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            cons = new DBconnection().getConnecttion();
            PreparedStatement pt = cons.prepareStatement(query);
            pt.setInt(1, machusan);
            pt.setString(2, tenchusan);
            pt.setString(3, sdt);
            pt.setString(4, diachi);
            pt.setString(5, username);
            pt.setString(6, password);
            pt.setString(7, email);
            pt.executeUpdate();
            //7

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
