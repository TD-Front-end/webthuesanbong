package com.example.webthuesanbong.model;

public class Pitch {
    private int id;
    private String ten;
    private String Vitri;
    //constructor
    public Pitch(){

    }
    public Pitch(int id, String ten, String vitri) {
        this.id = id;
        this.ten = ten;
        Vitri = vitri;
    }
    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getVitri() {
        return Vitri;
    }

    public void setVitri(String vitri) {
        Vitri = vitri;
    }


}
