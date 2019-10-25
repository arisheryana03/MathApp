package com.aries.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    TextView tvkpk1, tvkpk2, tvkpk3, tvkpk4, tvkpk5;
    EditText edkpk1, edkpk2;
    Button bkpk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tvkpk1 = findViewById(R.id.tvkpk1);
        tvkpk2 = findViewById(R.id.tvkpk2);
        tvkpk3 = findViewById(R.id.tvkpk3);
        tvkpk4 = findViewById(R.id.tvkpk4);
        tvkpk5 = findViewById(R.id.tvkpk5);
        edkpk1 = findViewById(R.id.edkpk1);
        edkpk2 = findViewById(R.id.edkpk2);
        bkpk = findViewById(R.id.bkpk);
        bkpk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = edkpk1.getText().toString();
                String number2 = edkpk2.getText().toString();

                if (!TextUtils.isEmpty(number1)) {
                    if (!TextUtils.isEmpty(number2)) {
                        int a = Integer.parseInt(number1);
                        int b = Integer.parseInt(number2);
                        int c = 0;

                        for (int x = 1; x <= b; x++) {
                            c = (c + a);
                            if (c % b == 0) {
                                tvkpk3.setText(String.valueOf(c));
                            }
                        }
                        int d;
                        d = a & b;

                        while ((d != 0)) {
                            a = b;
                            b = d;
                            d = a % b;
                            tvkpk5.setText(String.valueOf(b));
                        }
                        tvkpk2.setText("Hasil KPK-nya adalah ");
                        tvkpk4.setText("Hasil FPB-nya adalah ");
                    } else {
                        Toast.makeText(Main4Activity.this, "Maaf, nilai tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Main4Activity.this, "Maaf, nilai tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
