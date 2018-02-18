package com.example.android.leonardo_1202154152_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashAvtivity extends AppCompatActivity {
    //Untuk menentukan berapa lama splashscreen akan ditampilkan 3000 berarti 3 detik
    private static int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_avtivity);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                //Untuk lanjut ke MainActivity setelah 3 detik
                Intent intent = new Intent(SplashAvtivity.this, MainActivity.class);
                startActivity(intent);
                //Agar activity lain tidak dapat kembali lagi ke activity ini
                finish();
            }
        },SPLASH_TIME);
    }
}
