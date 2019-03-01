package com.example.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private TextView tv, tv2,textView;
private ImageView iv, iv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv =(TextView)findViewById(R.id.tv);
        tv2=(TextView)findViewById(R.id.tv2);
        textView=(TextView)findViewById(R.id.textView);
        iv=(ImageView) findViewById(R.id.iv);
        iv2=(ImageView) findViewById(R.id.iv2);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        tv.startAnimation(myanim);
        tv2.startAnimation(myanim);
        textView.startAnimation(myanim);
        iv.startAnimation(myanim);
        iv2.startAnimation(myanim);

        final Intent i = new Intent(this, Main2Activity.class);



        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2700);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                   }
                }
            };
            timer.start();
        }


    }

