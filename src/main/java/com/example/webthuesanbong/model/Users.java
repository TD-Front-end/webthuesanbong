package com.example.webthuesanbong.model;

public class Users {
    private int Machusan;
    private String Tenchusan;
    private String Sdt;
    private String Diachi;
    private String Username;
    private String password;
    private String Email;
//
    public Users(int machusan, String tenchusan, String sdt, String diachi, String username, String password, String email) {
        Machusan = machusan;
        Tenchusan = tenchusan;
        Sdt = sdt;
        Diachi = diachi;
        Username = username;
        this.password = password;
        Email = email;
    }
//

    public int getMachusan() {
        return Machusan;
    }

    public void setMachusan(int machusan) {
        Machusan = machusan;
    }

    public String getTenchusan() {
        return Tenchusan;
    }

    public void setTenchusan(String tenchusan) {
        Tenchusan = tenchusan;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
