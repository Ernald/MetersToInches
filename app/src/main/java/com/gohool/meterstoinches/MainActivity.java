package com.gohool.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 1 m= 39.3701 in

    private EditText putMeterText;
    private Button convertButton;
    private TextView showView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        putMeterText = (EditText) findViewById(R.id.meterEditText);
        convertButton = (Button) findViewById(R.id.converterid);
        showView = (TextView) findViewById(R.id.textid);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Conversion Logic
                double result = 0;
                double multiper = 39.37;

                if(putMeterText.getText().toString().equals("")) {
                    showView.setText(R.string.error_messages);
                    showView.setTextColor(Color.RED);
                }else {
                    double meterValue =Double.parseDouble(putMeterText.getText().toString());
                    result = meterValue * multiper;
                    showView.setText(String.format("%.2f", result) + " inches");
                    showView.setTextColor(Color.CYAN);
                }
            }
        });

    }

}