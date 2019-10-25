package com.aries.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText ed;
    Button b, b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv2);
        ed = findViewById(R.id.ed);
        b = findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String angka = ed.getText().toString();

                if (!TextUtils.isEmpty(angka)) {

                    int nilai = Integer.parseInt(angka);

                    if (nilai % 2 == 0) {
                        tv.setText("Angka " + nilai + " adalah angka genap ");
                    } else {
                        tv.setText("Angka " + nilai + " adalah angka ganjil");
                    }
                } else {

                    Toast.makeText(MainActivity.this, "Maaf, nilai tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
