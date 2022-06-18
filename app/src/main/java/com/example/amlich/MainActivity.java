package com.example.amlich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNamDL, etKq;
    Button btnXem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNamDL = (EditText)findViewById(R.id.etNamAmLich);
        etKq = (EditText) findViewById(R.id.etKq);
        btnXem = (Button) findViewById(R.id.btnXem);
        btnXem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XemNamAL();
            }
        });
    }
    public void XemNamAL(){
        int namDL = Integer.parseInt(etNamDL.getText().toString());
        AmLich amLich = new AmLich(namDL);
        String namAL = amLich.getNamAL();
        etKq.setText(namAL);
    }
}