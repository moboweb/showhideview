package com.example.showhideview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MyActivity extends Activity {
    private Button info1;
    private LinearLayout info2;
    int button1, button2;
    private Animation slidedown, slideup;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button1 =0; button2 =0;
        slidedown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        slideup = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);

        info1 = (Button) findViewById(R.id.info1);
        info2 = (LinearLayout) findViewById(R.id.info2);
    }

    public void button1_onClick(View v) {
        if((button1 == 0)) {
            info1.startAnimation(slidedown);
            info1.setVisibility(View.VISIBLE);
            button1 = 1;
        }
        else {
            info1.startAnimation(slideup);
            info1.setVisibility(View.GONE);
            button1 = 0;
        }
    }

    public void button2_onClick(View v) {
        if((button2 == 0)) {
            info2.startAnimation(slidedown);
            info2.setVisibility(View.VISIBLE);
            button2 = 1;
        }
        else {
            info2.startAnimation(slideup);
            info2.setVisibility(View.GONE);
            button2 = 0;
        }
    }
}
