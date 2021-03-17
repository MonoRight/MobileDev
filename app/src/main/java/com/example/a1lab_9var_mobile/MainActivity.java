package com.example.a1lab_9var_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void clickOKButton(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        RadioButton plusOperation = (RadioButton) findViewById(R.id.plusOperation);
        RadioButton minusOperation = (RadioButton) findViewById(R.id.minusOperation);
        RadioButton multiplyOperation = (RadioButton) findViewById(R.id.multiplyOperation);
        RadioButton divisionOperation = (RadioButton) findViewById(R.id.divisionOperation);
        TextView textResult = (TextView) findViewById(R.id.textView);

        if(!firstNum.getText().toString().isEmpty() && !secondNum.getText().toString().isEmpty()){
            double a = Double.parseDouble(firstNum.getText().toString());
            double b = Double.parseDouble(secondNum.getText().toString());
            double result;
            if(plusOperation.isChecked()){
                result = a + b;
            }
            else if(minusOperation.isChecked()){
                result = a - b;
            }
            else if(multiplyOperation.isChecked()){
                result = a * b;
            }
            else{
                result = a / b;
            }
            textResult.setText("Ответ: " + Double.toString(result));
        }
        else{
            textResult.setText("Заполните два поля!");
        }
    }

    public void clickCancelButton(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        RadioButton plusOperation = (RadioButton) findViewById(R.id.plusOperation);
        TextView textResult = (TextView) findViewById(R.id.textView);

        firstNum.setText("");
        secondNum.setText("");
        plusOperation.setChecked(true);
        textResult.setText("Ответ: ");
    }
}