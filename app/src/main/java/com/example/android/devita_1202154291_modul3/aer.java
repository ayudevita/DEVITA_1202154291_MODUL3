package com.example.android.devita_1202154291_modul3;

/**
 * Created by ASUS on 23/02/2018.
 */

//Class ini sebagai enkapsulasi
public class aer {
    String nama; String detail; int baack;

    public aer(String nama, String detail, int baack) {
        this.nama = nama;
        this.detail = detail;
        this.baack = baack;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getBaack() {
        return baack;
    }

    public void setBaack(int baack) {
        this.baack = baack;
    }
}
