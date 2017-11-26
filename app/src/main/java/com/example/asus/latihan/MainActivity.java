package com.example.asus.latihan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int a=0,b=0;
    TextView quantityTextViewA,quantityTextViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantityTextViewA = (TextView) findViewById(
                R.id.score_A
        );
        quantityTextViewB = (TextView) findViewById(
                R.id.score_B
        );
    }

    public void displayA(int score){
        quantityTextViewA.setText(""+score);
    }

    public void displayB(int score){
        quantityTextViewB.setText(""+score);
    }

    public void reset (View view){
        a=0;
        b=0;
        displayB(b);
        displayA(a);
        Toast(2);
    }

    public void Toast(int option){
        switch (option) {
            case 1:   Toast.makeText(this, "The Score Has Been Change", Toast.LENGTH_SHORT).show();
            break;
            case 2:   Toast.makeText(this, "The Score Has Been Reset", Toast.LENGTH_SHORT).show();
            break;
        }
    }

    public void point2A(View view){
        a+=2;
        displayA(a);
        Toast(1);
    }

    public void point3A(View view){
        a+=3;
        displayA(a);
        Toast(1);
    }

    public void freethrowA(View view){
        a+=1;
        displayA(a);
        Toast(1);
    }

    public void point2B(View view){
        b+=2;
        displayB(b);
        Toast(1);
    }

    public void point3B(View view){
        b+=3;
        displayB(b);
        Toast(1);
    }

    public void freethrowB(View view){
        b+=1;
        displayB(b);
        Toast(1);
    }

    public void kirim(View view){
        Intent intentKirim = new Intent (this, Main2Activity.class);

        intentKirim.putExtra("SCOREA", a);
        intentKirim.putExtra("SCOREB", b);
        startActivity(intentKirim);
    }
}
