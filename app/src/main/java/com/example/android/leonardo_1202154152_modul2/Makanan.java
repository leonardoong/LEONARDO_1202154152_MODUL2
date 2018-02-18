package com.example.android.leonardo_1202154152_modul2;

/**
 * Created by Leonardo on 2/17/2018.
 */

    //Class untuk menyimpan data makanan yang ada
public class Makanan {
    private int id;
    private String nama;
    private String harga;
    private int gambar;
    private String bahan;

    //Method/Constructor untuk menentukan parameter apa saja yang dibutuhkan oleh class makanan ini
    public Makanan(int id, String nama, String harga, int gambar, String bahan){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
        this.bahan = bahan;
    }

    //Untuk mengambil data makanan
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

    public String getBahan(){
        return bahan;
    }
}
