package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Q5 extends AppCompatActivity {
    TextView textView,data,temp;
    Button next;
    CheckBox c1,c2,c3,c4;
    int score;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q5act);

        textView = findViewById(R.id.textView3);
        textView.setText(Html.fromHtml("<font color='#1C753B'>-    -    -    -    -</font>"));

//        Taking data
        Bundle b=getIntent().getExtras();
        s=b.getString("name");

        score=b.getInt("score");
//        String t=String.valueOf(score);
//        temp.setText(t);


        c1=findViewById(R.id.checkBox1);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked() && c2.isChecked() && c4.isChecked()){
                    score++;
                }


                Intent intent=new Intent(getApplicationContext(),Q6.class);
                Bundle extras = new Bundle();
                extras.putString("name",s);
                extras.putInt("score",score);
                intent.putExtras(extras);

                startActivity(intent);

            }
        });
    }
}