package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    ImageView fifth_back_arrow, fifth_arrow_up;
    TextView second_title5, second_subtitle5, more_details5;
    Animation from_left, from_right, from_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        fifth_back_arrow = findViewById(R.id.fifth_back_arrow);
        fifth_arrow_up = findViewById(R.id.fifth_arrow_up);
        second_title5 = findViewById(R.id.second_title5);
        second_subtitle5 = findViewById(R.id.second_subtitle5);
        more_details5 = findViewById(R.id.more_details5);

        fifth_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(FourthActivity.this,MainActivity.class);
                startActivity(mainActivity);
            }
        });

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );

        from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left);
        from_right = AnimationUtils.loadAnimation(this, R.anim.anim_from_right);
        from_bottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);

        fifth_back_arrow.setAnimation(from_left);
        second_title5.setAnimation(from_right);
        second_subtitle5.setAnimation(from_right);
        fifth_arrow_up.setAnimation(from_bottom);
        more_details5.setAnimation(from_bottom);

        fifth_arrow_up.setOnClickListener((view) -> {
            Intent intent = new Intent(FourthActivity.this,SeventhActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(fifth_arrow_up, "background_image_transition");
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(FourthActivity.this,pairs);
            startActivity(intent,options.toBundle());
        });

    }
}