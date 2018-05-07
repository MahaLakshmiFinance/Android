package com.developerswork.gopinadh.mahalakshmifinance;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
    ImageView logo;
    AnimatorSet animSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logo = (ImageView)findViewById(R.id.imageView2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                logo.clearAnimation();
                logo.setScaleX(0.5F);
                logo.setScaleY(0.5F);
                ObjectAnimator animY =  ObjectAnimator.ofFloat(logo,"y",-200F);
                animY.setDuration(0L);
                animSet = new AnimatorSet();
                animSet.playTogether(animY);
                animSet.start();
            }
        },0);
    }

    public void verifyLogin(View view){
        Intent verified = new Intent(this,Home.class);
        startActivity(verified);

    }
}
