package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Q6 extends AppCompatActivity {
    TextView textView;
    Button b1,b2,next;
    RadioGroup rg;
    int score;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q6act);
        // Design of -----
        textView = findViewById(R.id.textView3);
        textView.setText(Html.fromHtml("<font color='#1C753B'>-    -</font>    -    -    -"));

//        Taking data from previous
        Bundle b=getIntent().getExtras();
        s=b.getString("name");
        score=b.getInt("score");

//        String t=String.valueOf(score);
//        temp.setText(t);

        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        rg=findViewById(R.id.rgr);
        next=findViewById(R.id.next);
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


            }});
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkedId=rg.getCheckedRadioButtonId();
                if(checkedId==R.id.btn2){
                    score++;

                }

                    Intent intent = new Intent(getApplicationContext(), Finalpg.class);
                    Bundle extras = new Bundle();
                    extras.putString("name", s);
                    extras.putInt("score", score);
                    intent.putExtras(extras);
                    startActivity(intent);

            }
        });
    }
}