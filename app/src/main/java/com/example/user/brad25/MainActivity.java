package com.example.user.brad25;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView apple;
    private ObjectAnimator anim1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apple = (ImageView)findViewById(R.id.apple);
    }

    public void test1(View v){
        anim1 = ObjectAnimator.ofFloat(apple,"y", 0,800,0);
        anim1.setDuration(2000);
        anim1.setRepeatCount(0);
        anim1.start();
    }

}
