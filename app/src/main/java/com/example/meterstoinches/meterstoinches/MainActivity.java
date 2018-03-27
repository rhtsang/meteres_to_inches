package com.example.meterstoinches.meterstoinches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText metersInput;
    private TextView inchesOutput;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metersInput = (EditText) findViewById(R.id.metersInputID);
        inchesOutput = (TextView) findViewById(R.id.inchesOutputID);
        convertButton = (Button) findViewById(R.id.convertButtonID);

        convertButton.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {

                                                 double multiplier = 39.37;
                                                 double result;

                                                 if (metersInput.getText().toString().equals("")) {
                                                     inchesOutput.setText("Please enter a valid input!");
                                                 } else {

                                                     double meters = Double.parseDouble(metersInput.getText().toString());
                                                     result = meters * multiplier;

                                                     //inchesOutput.setText(Double.toString(result));
                                                     inchesOutput.setText(String.format("%.2f", result));
                                                 }
                                             }
                                         }
        );
    }
}
