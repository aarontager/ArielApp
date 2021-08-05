package com.ariel.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculate(View view) {
        try {
            EditText et1 = findViewById(R.id.textInput1);
            EditText et2 = findViewById(R.id.textInput2);
            TextView result = findViewById(R.id.textViewResult);

            int input1 = Integer.parseInt(et1.getText().toString());
            int input2 = Integer.parseInt(et2.getText().toString());
            result.setText("" + (input1 + input2));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}