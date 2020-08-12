package com.example.clase11agosto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text);
        Button button = findViewById(R.id.button);
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        final Toasty toasty = new Toasty(MainActivity.this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasty.primaryToasty(v.getContext(), "3 missed calls", Toasty.LENGTH_LONG, Toasty.BOTTOM);
            }
        });

    }
}