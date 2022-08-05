package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Finalpg extends AppCompatActivity {
    TextView t,temp;
    int score;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalpg_act);
        Bundle b=getIntent().getExtras();
        s=b.getString("name");
        score=b.getInt("score");
         t=findViewById(R.id.theme);
        t.setText("Congratulations \n" + s);
        String print=String.valueOf(score);
        temp=findViewById(R.id.textView6);
        temp.setText(print + "/5");
    }
}