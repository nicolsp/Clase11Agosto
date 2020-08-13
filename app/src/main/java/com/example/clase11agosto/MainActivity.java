package com.example.clase11agosto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.prathameshmore.toastylibrary.Toasty;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toasty toasty = new Toasty(this);


        /*TextView textView = findViewById(R.id.text);

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        final Toasty toasty = new Toasty(MainActivity.this);
*/
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toasty.infoToasty(view.getContext(),"Holami nombre es nicols",Toasty.LENGTH_LONG,Toasty.BOTTOM,);
            }
        }
    }
}


 