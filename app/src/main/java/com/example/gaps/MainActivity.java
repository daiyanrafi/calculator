package com.example.gaps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button add, substract, multiply, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);



        tvAns = findViewById(R.id.tvAns);

        add = findViewById(R.id.btnADD);
        substract = findViewById(R.id.btnSubstract);
        multiply = findViewById(R.id.btnMultiply);
        division = findViewById(R.id.btnDivision);

        //Add

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue + secondValue ;

                tvAns.setText("The Answer is = "+ans);
            }
        });

        //Subatract

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue - secondValue ;

                tvAns.setText("The Answer is = "+ans);
            }
        });

        //Multiply

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue * secondValue ;

                tvAns.setText("The Answer is = "+ans);
            }
        });

        //Division

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue / secondValue ;

                tvAns.setText("The Answer is = "+ans);
            }
        });
    }
}