package com.example.asus.latihan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a=0,b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayA(int score){
        TextView quantityTextView = (TextView) findViewById(
                R.id.score_A
        );
        quantityTextView.setText(""+score);
    }

    public void displayB(int score){
        TextView quantityTextView = (TextView) findViewById(
                R.id.score_B
        );
        quantityTextView.setText(""+score);
    }

    public void reset (View view){
        a=0;
        b=0;
        displayB(b);
        displayA(a);
    }

    public void point2A(View view){
        a+=2;
        displayA(a);
    }

    public void point3A(View view){
        a+=3;
        displayA(a);
    }

    public void freethrowA(View view){
        a+=1;
        displayA(a);
    }

    public void point2B(View view){
        b+=2;
        displayB(b);
    }

    public void point3B(View view){
        b+=3;
        displayB(b);
    }

    public void freethrowB(View view){
        b+=1;
        displayB(b);
    }
}
