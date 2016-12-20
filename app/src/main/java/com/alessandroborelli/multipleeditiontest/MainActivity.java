package com.alessandroborelli.multipleeditiontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alessandroborelli.custom.MEditText;

public class MainActivity extends AppCompatActivity {

    private MEditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (MEditText) findViewById(R.id.edittext);
    }
}
