package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    Button bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bn=findViewById(R.id.button);
        bn.setOnClickListener(new OnClickListener(){
            @Override

            public void onClick(View v) {
                TextView t=findViewById(R.id.textInputEditText);
                String name=t.getText().toString();
                Bundle extras=new Bundle();
                Intent intent=new Intent(getApplicationContext(),Q2actActivity.class);
                extras.putString("name",name);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}