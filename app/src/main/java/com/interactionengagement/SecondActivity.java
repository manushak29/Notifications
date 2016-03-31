package com.interactionengagement;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Anna on 31/03/2016.
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent  = getIntent();
        if (intent == null || intent.getData() == null) {
            finish();
        }
        intent.getData();
    }
}
