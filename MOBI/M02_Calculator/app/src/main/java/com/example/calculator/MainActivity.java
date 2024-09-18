package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText NumberBoxN1 = (EditText) findViewById(R.id.Input_N1);
        EditText NumberBoxN2 = (EditText) findViewById(R.id.Input_N2);
        // we actually don't need to get ans from screen
        EditText textANS = (EditText) findViewById(R.id.Num_Answer);
        textANS.setFocusable(false);


        // Action when "Add" button is pressed
        Button addButton = (Button) findViewById(R.id.b_Add);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator ADD BUTTON", "User tapped the Add button");

                Double input1 = 0.0;
                Double input2 = 0.0;
                Double output_answer = 0.0;

                try {
                    input1 = Double.parseDouble(NumberBoxN1.getText().toString());
                    input2 = Double.parseDouble(NumberBoxN2.getText().toString());
                    output_answer = input1 + input2;
                }
                catch (Exception e) {
                    Log.w("M01_Calculator ADD BUTTON", "Add Selected with no inputs ... " + output_answer);
                }

                // Set the Answer into the the answer field
                textANS.setText(output_answer.toString());

                // log what we are doing
                Log.w("M01_Calculator ADD BUTTON", "Add Selected with => " + input1 + " + " + input2 + "=" + output_answer);
            }
        });

        Button subtractButton = (Button) findViewById(R.id.b_Subtract);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator SUBTRACT BUTTON", "User tapped the Add button");

                Double input1 = 0.0;
                Double input2 = 0.0;
                Double output_answer = 0.0;

                try {
                    input1 = Double.parseDouble(NumberBoxN1.getText().toString());
                    input2 = Double.parseDouble(NumberBoxN2.getText().toString());
                    output_answer = input1 - input2;
                }
                catch (Exception e) {
                    Log.w("M01_Calculator SUBTRACT BUTTON", "Add Selected with no inputs ... " + output_answer);
                }

                // Set the Answer into the the answer field
                textANS.setText(output_answer.toString());

                // log what we are doing
                Log.w("M01_Calculator SUBTRACT BUTTON", "Add Selected with => " + input1 + " - " + input2 + "=" + output_answer);
            }
        });

        Button divideButton = (Button) findViewById(R.id.b_Divide);
        divideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator SUBTRACT BUTTON", "User tapped the Add button");

                Double input1 = 0.0;
                Double input2 = 0.0;
                Double output_answer = 0.0;

                try {
                    input1 = Double.parseDouble(NumberBoxN1.getText().toString());
                    input2 = Double.parseDouble(NumberBoxN2.getText().toString());
                    output_answer = input1 - input2;
                }
                catch (Exception e) {
                    Log.w("M01_Calculator SUBTRACT BUTTON", "Add Selected with no inputs ... " + output_answer);
                }

                // Set the Answer into the the answer field
                textANS.setText(output_answer.toString());

                // log what we are doing
                Log.w("M01_Calculator SUBTRACT BUTTON", "Add Selected with => " + input1 + " - " + input2 + "=" + output_answer);
            }
        });

    }

}
