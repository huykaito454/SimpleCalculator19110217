package com.android.simplecalulator19110217;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "CalculatorActivity";
    public Calculator mCalculator;
    private Button btnAdd, btnSub, btnDiv, btnMul, btnPow, btnFac, btnLog;
    private EditText editText1, editText2;
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalculator = new Calculator();
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnPow = findViewById(R.id.btnPow);
        btnFac = findViewById(R.id.btnFac);
        btnLog = findViewById(R.id.btnLog);
        txtResult = findViewById(R.id.txtResult);
        editText1 = findViewById(R.id.operand1);
        editText2 = findViewById(R.id.operand2);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute(Calculator.Operator.ADD);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute(Calculator.Operator.SUB);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute(Calculator.Operator.DIV);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute(Calculator.Operator.MUL);
            }
        });
        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute(Calculator.Operator.POW);
            }
        });
        btnFac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    compute(Calculator.Operator.FAC);
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute(Calculator.Operator.LOG);
            }
        });

    }

    private void compute(Calculator.Operator operator) {
        double operandOne;
        double operandTwo;
        try {
            operandOne = getOperand(editText1);
        } catch (NumberFormatException nfe) {
            Log.e(TAG, "NullPointerException", nfe);
            txtResult.setText(getString(R.string.computationError));
            return;
        }
        try {
            operandTwo = getOperand(editText2);
        } catch (NumberFormatException nfe) {
            Log.e(TAG, "NullPointerException", nfe);
            txtResult.setText(getString(R.string.computationError));
            return;
        }

        String result;
        switch (operator) {
            case ADD:
                result = String.valueOf(
                        mCalculator.add(operandOne, operandTwo));
                break;
            case SUB:
                result = String.valueOf(
                        mCalculator.sub(operandOne, operandTwo));
                break;
            case DIV:
                result = String.valueOf(
                        mCalculator.div(operandOne, operandTwo));
                break;
            case MUL:
                result = String.valueOf(
                        mCalculator.mul(operandOne, operandTwo));
                break;
            case LOG:
                result = String.valueOf(mCalculator.log(operandOne, operandTwo));
                break;
            case POW:
                result = String.valueOf(mCalculator.pow(operandOne, operandTwo));
                break;
            case FAC:
                result = String.valueOf(mCalculator.fac(operandOne));
                break;
            default:
                result = getString(R.string.computationError);
                break;
        }
        txtResult.setText(result);
    }


    private static Double getOperand(EditText operandEditText) {
        String operandText = getOperandText(operandEditText);
        return Double.valueOf(operandText);
    }


    private static String getOperandText(EditText operandEditText) {
        return operandEditText.getText().toString();
    }


}