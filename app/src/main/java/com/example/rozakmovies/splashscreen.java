package com.example.rozakmovies;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashscreen extends AppCompatActivity {
    Animation anim;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        imageView=(ImageView)findViewById(R.id.imageView2);
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.side_slide);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(splashscreen.this,MainActivity.class));
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        imageView.startAnimation(anim);

//
//        new Handler().postDelayed(new Runnable() {
//             @Override
//            public void run() {
//                Intent intent = new Intent(splashscreen.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        },1000);
    }
}