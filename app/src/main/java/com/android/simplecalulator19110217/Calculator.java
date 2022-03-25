package com.android.simplecalulator19110217;

import static java.lang.Double.NaN;
import static java.sql.Types.FLOAT;
import static java.sql.Types.NULL;

public class Calculator {
    public enum Operator {ADD, SUB, DIV, MUL, POW, FAC, LOG}
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }


    public double sub(double num1, double num2) {
        return num1 - num2;
    }


    public double div(double num1, double num2) {
        return num1 / num2;
    }


    public double mul(double num1, double num2) {
        return num1 * num2;
    }
    public double pow(double num1, double num2) {
        return Math.pow(num1,num2);
    }


    public double fac(double num1) {
        double temp = (int) num1;
        if(num1 >= 0 && num1 / temp == 1){
            for(double i=num1 - 1; i>0 ; i--){
                num1 = i * num1;
            }
            return num1;
        }
        else if (num1 < 0 && num1 / temp == 1) {
            num1 = num1 * -1;
            for(double i=num1 - 1; i>0 ; i--){
                num1 = i * num1;
            }
            return -num1;
        }
        else {
            if(num1 == 0){
                return 1;
            }
            else return NaN;
        }

    }


    public double log(double num1, double num2) {
        return Math.log(num2)/Math.log(num1);
    }
}
