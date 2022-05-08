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

public class FifthActivity extends AppCompatActivity {

    Animation from_left, from_right, from_bottom;
    TextView second_title3, second_subtitle3, more_details3;
    ImageView fourth_back_arrow , fourth_arrow_up;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        fourth_back_arrow = findViewById(R.id.fourth_back_arrow);
        fourth_arrow_up = findViewById(R.id.fourth_arrow_up);
        second_title3 = findViewById(R.id.second_title3);
        second_subtitle3 = findViewById(R.id.second_subtitle3);
        more_details3 = findViewById(R.id.more_details3);

        fourth_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(FifthActivity.this , MainActivity.class);
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

        fourth_back_arrow.setAnimation(from_left);
        second_title3.setAnimation(from_right);
        second_subtitle3.setAnimation(from_right);
        fourth_arrow_up.setAnimation(from_bottom);
        more_details3.setAnimation(from_bottom);

        fourth_arrow_up.setOnClickListener((view) -> {
            Intent intent = new Intent(FifthActivity.this,SixthActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(fourth_arrow_up, "background_image_transition");
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(FifthActivity.this,pairs);
            startActivity(intent,options.toBundle());
        });



    }
}