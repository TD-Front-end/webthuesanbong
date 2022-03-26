package dao;
import model.Users;

import java.sql.*;

public class UsersDAO {
    Connection con ;
    ResultSet rs = null;

    public UsersDAO() {
        this.con = con;
    }

    //for register user
    public boolean saveUser(Users user){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into user(username,Email,password) values(?,?,?)";

            PreparedStatement pt = this.con.prepareStatement(query);
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
            PreparedStatement pt = this.con.prepareStatement(query);
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


}
