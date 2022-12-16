package com.example.triangleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText EditWidht;
    EditText EditHeight;
    TextView TextResult;
    Button ButtonCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditWidht = (EditText) findViewById(R.id.edt1);
        EditHeight = (EditText) findViewById(R.id.edt2);
        TextResult = (TextView) findViewById(R.id.ans);
        ButtonCount = (Button) findViewById(R.id.btn1);

        ButtonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { calculate(); }
        });


    }
    public void calculate() {
        Double value1 = Double.parseDouble(EditWidht.getText().toString());
        Double value2 = Double.parseDouble(EditHeight.getText().toString());
        Double CalculateValue = ((value1*value2)*1/2);
        TextResult.setText(CalculateValue.toString());

    }
}