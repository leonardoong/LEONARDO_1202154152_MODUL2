package com.example.android.leonardo_1202154152_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "LEONARDO_1202154152", Toast.LENGTH_SHORT).show();
        final RadioButton dineIn = (RadioButton) findViewById(R.id.dineIn);
        final RadioButton takeAway = (RadioButton) findViewById(R.id.takeAway);
        Button pesan = (Button) findViewById(R.id.pesan);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dineIn.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, DineInActivity.class);
                    startActivity(intent);
                } else if (takeAway.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, TakeAwayActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void onRadioButtonClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.dineIn:
                if (checked)
                    Toast.makeText(this, "Anda memilih Dine In", Toast.LENGTH_SHORT).show();
                break;
            case R.id.takeAway:
                if (checked)
                    Toast.makeText(this, "Anda memilih Take Away", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                break;
        }
    }

}
