package com.example.farhan.aritmatika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class kovertmatauang extends AppCompatActivity {

    Button btnproses;
    EditText input;
    RadioButton r1, r2;
    TextView tampilhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kovertmatauang);

        input = findViewById(R.id.Input);
        r1 = findViewById(R.id.Dolar);
        r2 = findViewById(R.id.Euro);
        tampilhasil = findViewById(R.id.Hasil);

        btnproses = findViewById(R.id.btnProses);
        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rupiah = input.getText().toString();
                double hasil;

                if (r1.isChecked()){
                    hasil = Double.parseDouble(rupiah)/13000;
                    hasil = Math.floor(hasil * 100)/100;
                    String hasilfix = Double.toString(hasil);
                    tampilhasil.setText(hasilfix + " USD");
                }
                else if (r2.isChecked()){
                    hasil = Double.parseDouble(rupiah)/15000;
                    hasil = Math.floor(hasil * 100)/100;
                    String hasilfix = Double.toString(hasil);
                    tampilhasil.setText(hasilfix + " EUR");
                }

                else{
                    tampilhasil.setText("Pilih dahulu!!");
                }

            }
        });

    }
}
