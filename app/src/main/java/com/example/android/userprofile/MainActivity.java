package com.example.android.userprofile;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = findViewById(R.id.name);
        name.setText("Robert");
        name.setTextSize(36);


        TextView birthday = findViewById(R.id.birthday);
        birthday.setText("05/03/1989");
        birthday.setTextSize(24);

        TextView country = findViewById(R.id.country);
        country.setText("Poland");
        country.setTextSize(18);

        ImageView image = findViewById(R.id.profile_picture);
        image.setImageResource(R.drawable.code);
    }
}
