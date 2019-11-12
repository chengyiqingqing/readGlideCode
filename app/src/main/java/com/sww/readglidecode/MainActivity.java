package com.sww.readglidecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private TextView textShow;
    private ImageView image_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textShow = findViewById(R.id.text_show);
        image_show = findViewById(R.id.image_show);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Glide.with(this)
                .load("https://www.baidu.com/img/bd_logo1.png?where=super")
                .into(image_show);
    }

}
