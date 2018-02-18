package com.example.android.leonardo_1202154152_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    private String mSpinnerLabel = "";
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        //Untuk mendeklarasikan spinner yang ada
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        //membuat adapter agar spinner yang dibuat berisi dari array meja_array dan layout simple spinner item
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.meja_array, android.R.layout.simple_spinner_item);
        //Untuk layout dropdown menggunakan simple spinner dropdown
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
        //Lalu ketika button pesan di klik maka akan mengalihkan ke aktivitas MenuActivity
        Button pesan = (Button) findViewById(R.id.buttonPesanDine);
        EditText editText = (EditText) findViewById(R.id.nama);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.nama);
                String showString = editText.getText().toString();
                Toast.makeText(DineInActivity.this, showString +" memilih " + mSpinnerLabel, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DineInActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }

    //Ketika salah satu item spinner dipilih maka akan disimpan posisinya di method ini
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
    }

    @Override

    //Jika tidak ada yang dipilih akan muncul di log
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, "onNothingSelected: ");
    }
    
}
