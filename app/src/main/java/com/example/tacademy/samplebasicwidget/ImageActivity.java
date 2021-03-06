package com.example.tacademy.samplebasicwidget;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {
    Drawable mDrawable;
    ImageView clipView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        clipView = (ImageView)findViewById(R.id.imageView);
        mDrawable = clipView.getDrawable();

        Button btn = (Button)findViewById(R.id.btn_clip);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int level = mDrawable.getLevel();
                level = (level +  1000 > 10000) ? 0 : (level + 1000);
                mDrawable.setLevel(level);
            }
        });
    }
}
