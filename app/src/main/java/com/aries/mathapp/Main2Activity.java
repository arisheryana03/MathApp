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

public class Main2Activity extends AppCompatActivity {

    TextView tvb;
    EditText edb1, edb2;
    Button bb, bb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvb = findViewById(R.id.tvb2);
        edb1 = findViewById(R.id.edb1);
        edb2 = findViewById(R.id.edb2);
        bb = findViewById(R.id.bb);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomer1 = edb1.getText().toString();
                String nomer2 = edb2.getText().toString();

                if (!TextUtils.isEmpty(nomer1)) {
                    if (!TextUtils.isEmpty(nomer2)) {
                        int bil1 = Integer.parseInt(nomer1);
                        int bil2 = Integer.parseInt(nomer2);

                        if (bil1 > bil2) {
                            tvb.setText("Angka pertama lebih besar dari angka kedua");
                        } else if (bil1 < bil2) {
                            tvb.setText("Angka pertama lebih kecil dari angka kedua");
                        } else {
                            tvb.setText("Angka pertama dan angka kedua sama besar");
                        }


                    } else {
                        Toast.makeText(Main2Activity.this, "Maaf, nilai tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Main2Activity.this, "Maaf, nilai tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }

            ;
        });
    }
}

