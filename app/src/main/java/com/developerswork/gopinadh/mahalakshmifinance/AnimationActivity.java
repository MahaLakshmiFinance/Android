package com.developerswork.gopinadh.mahalakshmifinance;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {
    ImageView logo;
    Animation anim;
    AnimatorSet animSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        logo = (ImageView)findViewById(R.id.imageView);

        anim = AnimationUtils.loadAnimation(this,R.anim.logoanim);

        logo.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                logo.clearAnimation();
                logo.setScaleX(0.5F);
                logo.setScaleY(0.5F);
                ObjectAnimator animY =  ObjectAnimator.ofFloat(logo,"y",-200F);
                animY.setDuration(1200L);
                animSet = new AnimatorSet();
                animSet.playTogether(animY);
                animSet.start();
            }
        },2000);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if (animSet.isRunning()){
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
                Intent animation = new Intent(AnimationActivity.this, LoginActivity.class);
                startActivity(animation);
                finish();
            }
        },3500);

    }
}
