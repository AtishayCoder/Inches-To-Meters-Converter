package com.example.inchestometersconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText inches;
    TextView result;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonClickListener();
    }

    private void findViews() {
        inches = findViewById(R.id.inchesEditable);
        result = findViewById(R.id.resultTextView);
        convert = findViewById(R.id.convertButton);
    }

    /** @noinspection Convert2Lambda*/
    private void setupButtonClickListener() {
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToMeters();
            }
        });
    }

    private void convertToMeters() {
        double inchesValue = Double.parseDouble(inches.getText().toString());
        double metersValue = inchesValue * 0.0254;
        result.setText(String.valueOf(metersValue));
    }
}