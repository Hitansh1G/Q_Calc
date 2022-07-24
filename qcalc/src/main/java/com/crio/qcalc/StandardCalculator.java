package com.crio.qcalc;

public class StandardCalculator {
    protected double result;
    public double getResult() {
        return result;
    }
    
    public void clearResult() {
        result = 0;
    }
    
    public void printResult() {
        System.out.println("Standard Calculator Result:" + result);
    }
    //operations
    public final void add(int num1, int num2) {
        // result = ((double) num1 + (double) num2);
        add((double) num1, (double) num2);
    }

    public void add(double num1, double num2) {
        double result = num1 + num2;
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }


    public final void subtract(int num1, int num2) {
        // result = ((double) num1 - (double) num2);
        subtract((double) num1, (double) num2);
    }

    public void subtract(double num1, double num2) {
        double result = num1 - num2;
        if ((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }


    public final void multiply(int num1, int num2) {
        // result = ((double) num1 * (double) num2);
        multiply((double) num1, (double) num2);
    }

    public void multiply(double num1, double num2) {
        double result = num1 * num2;
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }


    public final void divide(int num1, int num2) {
        // result = ((double) num1 / (double) num2);
        divide((double) num1, (double) num2);
    }

    public void divide(double num1, double num2) {
        double result = num1 / num2;
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

}

// public int add(int num1, int num2){

// }


// public int subtract(int num1, int num2){

// }


// public int multiply(int num1, int num2){

// }


// public int divide(int num1, int num2){

// }

