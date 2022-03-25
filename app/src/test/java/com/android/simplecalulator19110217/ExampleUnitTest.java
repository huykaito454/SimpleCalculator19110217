package com.android.simplecalulator19110217;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static java.lang.Double.NaN;
import static java.lang.Double.isInfinite;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExampleUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }
    @After
    public void tearDown(){

    }
    @Test
    public void addTwoPositiveNumbers() {
        double result = mCalculator.add(1d,3d);
        assertEquals(result,4,0);
    }
    @Test
    public void addTwoNegativeNumber() {
        double result = mCalculator.add(-1d,-3d);
        assertEquals(result,-4,0);

    }
    @Test
    public void addOneNegativeNumbersOnePositiveNumbers() {
        double result = mCalculator.add(-1d,3d);
        assertEquals(result,2,0);
    }
    @Test
    public void addNumberFloat() {
        double result = mCalculator.add(-1.123f,3.12312f);
        assertEquals(result,2.00012,0.001);
    }
    @Test
    public void addNumberZero() {
        double result = mCalculator.add(0,0);
        assertEquals(result,0,0);
    }
    @Test
    public void subTwoPositiveNumbers() {
        double result = mCalculator.sub(1d,2d);
        assertEquals(result,-1,0);
    }
    @Test
    public void subTwoNegativeNumbers() {
        double result = mCalculator.sub(-1d,-2d);
        assertEquals(result,1,0);
    }
    @Test
    public void subOneNegativeNumbersOnePositiveNumbers() {
        double result = mCalculator.sub(-1d,2d);
        assertEquals(result,-3,0);
    }
    @Test
    public void subsOnePositiveNumbersOneNegativeNumber() {
        double result = mCalculator.sub(1d,-2d);
        assertEquals(result,3,0);
    }
    @Test
    public void subNumberFloat() {
        double result = mCalculator.sub(3.123f,2.12323f);
        assertEquals(result,1,0.001);
    }
    @Test
    public void divTwoNumbers() {
        double result = mCalculator.div(2d,2d);
        assertEquals(result,1,0);
    }
    @Test
    public void divZeroNumberNumber() {
        double result = mCalculator.div(0d,2d);
        assertEquals(result,0,0);
    }
    @Test
    public void divNumberZeroNumber() {
        double result = mCalculator.div(2d,0d);
        assertEquals(isInfinite(result),true);
    }
    @Test
    public void divZeroNumberZeroNumber() {
        double result = mCalculator.div(0d,0d);
        assertEquals(result,NaN,0);
    }
    @Test
    public void divFloatNumber() {
        double result = mCalculator.div(1.231f,5.123f);
        assertEquals(result,0.24,0.01);
    }
    @Test
    public void mulTwoPositiveNumbers() {
        double result = mCalculator.mul(2d,3d);
        assertEquals(result,6,0);
    }
    @Test
    public void mulTwoNegativeNumbers() {
        double result = mCalculator.mul(-2d,-3d);
        assertEquals(result,6,0);
    }
    @Test
    public void mulOneNegativeNumbersOnePositiveNumbers() {
        double result = mCalculator.mul(2d,-3d);
        assertEquals(result,-6,0);
    }
    @Test
    public void mulWithZeroNumber() {
        double result = mCalculator.mul(2d,0d);
        assertEquals(result,0,0);
    }
    @Test
    public void mulWithFloatNumber() {
        double result = mCalculator.mul(2d,3.1123f);
        assertEquals(result,6.22,0.01);
    }
    @Test
    public void powTestPositiveNumbers() {
        double result = mCalculator.pow(2d,3d);
        assertEquals(result,8,0);
    }
    @Test
    public void powTestNegativeNumbers() {
        double result = mCalculator.pow(2d,-3d);
        assertEquals(result,0.125,0);
    }
    @Test
    public void powTestZeroNumbers() {
        double result = mCalculator.pow(2d,0d);
        assertEquals(result,1,0);
    }
    @Test
    public void powTestFloatNumbers() {
        double result = mCalculator.pow(2d,2.12f);
        assertEquals(result,4.35,0.005);
    }
    @Test
    public void powTestZeroNumbers2() {
        double result = mCalculator.pow(0d,4.1112f);
        assertEquals(result,0,0);
    }
    @Test
    public void logTestPositiveNumbers() {
        double result = mCalculator.log(2d,8d);
        assertEquals(result,3,0);
    }
    @Test
    public void logTestBaseNegativeNumbers() {
        double result = mCalculator.log(-2d,8d);
        assertEquals(result,NaN,0);
    }
    @Test
    public void logTestValueNegativeNumbers() {
        double result = mCalculator.log(2d,-8d);
        assertEquals(result,NaN,0);
    }
    @Test
    public void logTestNegativeNumbers() {
        double result = mCalculator.log(-2d,-8d);
        assertEquals(result,NaN,0);
    }
    @Test
    public void logTestZeroNumbers() {
        double result = mCalculator.log(0d,-8d);
        assertEquals(result,NaN,0);
    }
    @Test
    public void facTestPositiveNumbers() {
        double result = mCalculator.fac(5d);
        assertEquals(result,120,0);
    }
    @Test
    public void facTestNegativeNumbers() {
        double result = mCalculator.fac(-5d);
        assertEquals(result,-120,0);
    }
    @Test
    public void facTestFloatNumbers() {
        double result = mCalculator.fac(5.12f);
        assertEquals(result,NaN,0);
    }
    @Test
    public void facTestZeroNumbers() {
        double result = mCalculator.fac(0d);
        assertEquals(result,1,0);
    }
    @Test
    public void facTestOneNumbers() {
        double result = mCalculator.fac(1d);
        assertEquals(result,1,0);
    }


}