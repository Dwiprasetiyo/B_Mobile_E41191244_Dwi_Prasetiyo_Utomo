package com.example.mingguketiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tugas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }
    public void button1(View view) {
        Intent intent = new Intent(Tugas.
                this,LinearLayout.class);
        startActivity(intent);
    }
    public void button2(View view) {
        Intent intent = new Intent(Tugas.
                this,RelativeLayout.class);
        startActivity(intent);
    }
    public void button3(View view) {
        Intent intent = new Intent(Tugas.
                this,ConstraintLayout1.class);
        startActivity(intent);
    }
    public void button4(View view) {
        Intent intent = new Intent(Tugas.
                this,FrameLayout.class);
        startActivity(intent);
    }
    public void button5(View view) {
        Intent intent = new Intent(Tugas.
                this,TabelLayout.class);
        startActivity(intent);
    }
    public void button6(View view) {
        Intent intent = new Intent(Tugas.
                this,MaterialDesign.class);
        startActivity(intent);
    }
    public void button7(View view) {
        Intent intent = new Intent(Tugas.
                this,ScrollView.class);
        startActivity(intent);
    }
    public void button8(View view) {
        Intent intent = new Intent(Tugas.
                this,ScrollViewHorizontal.class);
        startActivity(intent);
    }
}