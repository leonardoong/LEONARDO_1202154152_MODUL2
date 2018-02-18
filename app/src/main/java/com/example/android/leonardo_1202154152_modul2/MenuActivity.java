package com.example.android.leonardo_1202154152_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    List<Makanan> listMakanan;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listMakanan = new ArrayList<>();

        listMakanan.add(
                new Makanan(1, "Nasi Goreng", "Harga Rp. 14.000", R.drawable.nasi_goreng));

        listMakanan.add(
                new Makanan(2, "Bakso", "Harga Rp. 10.000", R.drawable.bakso));
        listMakanan.add(
                new Makanan(3, "Rendang", "Harga Rp. 16.000", R.drawable.rendang));
        listMakanan.add(
                new Makanan(4, "Sate Ayam", "Harga Rp. 15.000", R.drawable.sate));

        RecyclerAdapter adapter = new RecyclerAdapter(this, listMakanan);

        recyclerView.setAdapter(adapter);

    }
}
