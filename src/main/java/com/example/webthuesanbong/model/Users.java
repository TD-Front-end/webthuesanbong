package com.example.webthuesanbong.model;

public class Users {
    private int id;
    private String username;
    private String Email;
    private String password;
//
    public Users(int id, String username, String Email, String password) {
        this.id = id;
        this.username = username;
        this.Email = Email;
        this.password = password;
    }
//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
