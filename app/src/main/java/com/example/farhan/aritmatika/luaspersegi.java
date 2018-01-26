package com.example.farhan.aritmatika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class luaspersegi extends AppCompatActivity {

    EditText input,luas,keliling;
    Button btnproses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luaspersegi);

        input = findViewById(R.id.Input);
        luas = findViewById(R.id.Luas);
        keliling = findViewById(R.id.Keliling);
        btnproses = findViewById(R.id.btnProses);

        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungLuas();
                hitungKeliling();
            }
        });

    }

    private void hitungKeliling() {
        int sisi = Integer.parseInt(input.getText().toString());
        int keliling = 4*sisi;
        luas.setText(keliling+"");
    }

    private void hitungLuas() {
        int sisi = Integer.parseInt(input.getText().toString());
        int luas = sisi*sisi;
        keliling.setText(luas+"");
    }
}
