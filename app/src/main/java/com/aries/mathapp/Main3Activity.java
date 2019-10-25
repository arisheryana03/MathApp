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

public class Main3Activity extends AppCompatActivity {

    TextView tvk, tvk2;
    EditText edk1, edk2;
    Button bkhasil, bknext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvk = findViewById(R.id.tvk);
        tvk2 = findViewById(R.id.tvk2);
        edk1 = findViewById(R.id.edk1);
        edk2 = findViewById(R.id.edk2);
        bkhasil = findViewById(R.id.bkhasil);
        bkhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = edk1.getText().toString();
                String input2 = edk2.getText().toString();

                if (!TextUtils.isEmpty(input1)) {
                    if (!TextUtils.isEmpty(input2)) {
                        int nilai1 = Integer.parseInt(input1);
                        int nilai2 = Integer.parseInt(input2);

                        if (nilai1 % 7 == 0) {
                            double bkhasil = (float) (22 / 7 * nilai1 * nilai1 * nilai2 / 3);
                            tvk2.setText("Hasilnya adalah " + bkhasil);
                        } else {
                            float bkhasil = (float) (3.14 * nilai1 * nilai1 * nilai2 / 3);
                            tvk2.setText("Hasilnya adalah " + bkhasil);
                        }
                    } else {
                        Toast.makeText(Main3Activity.this, "Maaf, nilai tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Main3Activity.this, "Maaf, nilai tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
