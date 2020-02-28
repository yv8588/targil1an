package com.example.targil1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd=new Random();
    Button btn;
    ImageView iv;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
        iv =(ImageView)findViewById(R.id.iv);
    }

    public void click(View view) {
        x = rnd.nextInt(3) + 1;
        if (x == 1) {
            iv.setImageResource(R.drawable.one);
        } else if (x == 2) {
            iv.setImageResource(R.drawable.two);
        }
        else  {
            iv.setImageResource(R.drawable.three);
        }
    }

    }

