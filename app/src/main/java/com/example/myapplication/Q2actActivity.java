package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Q2actActivity extends AppCompatActivity {
    TextView textView,data;
    RadioGroup rg;
    Button b1,b2,b3,b4,next;
    int score=0;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q2act);
        textView = findViewById(R.id.textView3);

        textView.setText(Html.fromHtml("<font color='#1C753B'>-</font>    -    -    -    -"));

//        data=findViewById(R.id.textView4);
        Bundle b=getIntent().getExtras();
        s=b.getString("name");

        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        rg=findViewById(R.id.rgr);
        next=findViewById(R.id.next);
        //Border color format
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                Drawable d = getResources().getDrawable(R.drawable.selected_border);
                Drawable q = getResources().getDrawable(R.drawable.q_border);
               if(checkId==R.id.btn1){
                   b1.setBackground(d);
               }
                if(checkId!=R.id.btn1){
                    b1.setBackground(q);
                }

                if(checkId==R.id.btn2){
                    b2.setBackground(d);
                }
                if(checkId!=R.id.btn2){
                    b2.setBackground(q);
                }
                if(checkId==R.id.btn3){
                    b3.setBackground(d);
                }
                if(checkId!=R.id.btn3){
                    b3.setBackground(q);
                }
                if(checkId==R.id.btn4){
                    b4.setBackground(d);
                }
                if(checkId!=R.id.btn4){
                    b4.setBackground(q);
                }
            }

        });

        // Collecting score
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkedId=rg.getCheckedRadioButtonId();
                if(checkedId==R.id.btn1){
                    score++;

                }
                Intent intent = new Intent(getApplicationContext(),Q3.class);
                Bundle b = new Bundle();
                b.putString("name", s);
                b.putInt("score", score);
                intent.putExtras(b);
                startActivity(intent);
            }


        });

    }
}