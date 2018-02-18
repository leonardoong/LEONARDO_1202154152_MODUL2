package com.example.android.leonardo_1202154152_modul2;

/**
 * Created by Leonardo on 2/17/2018.
 */

public class Makanan {
    private int id;
    private String nama;
    private String harga;
    private int gambar;

    public Makanan(int id, String nama, String harga, int gambar){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
    }

    public int getId(){
        return id;
    }

    public String getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getGambar() {
        return gambar;
    }
}
