package com.example.mingguketiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LinearLayout extends AppCompatActivity {
    EditText Pada,Subject, Pesan;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        Pada = findViewById(R.id.Pada);
        Subject = findViewById(R.id.Subject);
        Pesan = findViewById(R.id.Pesan);
        Submit = findViewById(R.id.Submit);
    }
}