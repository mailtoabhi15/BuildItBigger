package com.dixit.abhishek.android.jokeandroidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        TextView tv2 = (TextView)findViewById(R.id.joke_textview);
        if (joke != null && joke.length() != 0)
            tv2.setText(joke);
    }
}
