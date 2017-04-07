package com.example.kevin.hw3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button back;
    EditText input;

    public static String KEY_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        input = (EditText)findViewById(R.id.TEXT_Name);
        back = (Button)findViewById(R.id.BTN_Back);
        back.setOnClickListener(Back);

    }

    private OnClickListener Back = new OnClickListener() {
        @Override
        public void onClick(View v) {
            String name = input.getText().toString();
            Intent intent = new Intent();

            intent.putExtra(KEY_NAME, name);
            setResult(RESULT_OK, intent);
            finish();

        }
    };
}
