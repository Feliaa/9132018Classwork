package com.example.soblab.a9132018classwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView) findViewById(R.id.tv1);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);

    };
    public void read_name(View view){

        tv1.setText("" +
                Integer.parseInt(et1.getText().toString().trim()) +
                Integer.parseInt(et2.getText().toString().trim())
        );

    }

    };

