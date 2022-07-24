package com.crio.qcalc;

public class ScientificCalculator extends StandardCalculator{
    /*
    It indicates inheritance. It specifies a parent-child relationship between classes. The
    syntax of it is: "child-class extends parent-class" and is specified in the first line of the
    class definition. When you use this keyword, all the public members of the parent class are
    inherited by the child class.
     */
    public static void getVersion(){
        System.out.println("Scientific Calculator 1.0");
    }

    public void sin(double a){
        result = Math.sin(a);
    }
    public void cos(double a){
        result = Math.cos(a);
    }

    public void square(double a) {
        multiply(a, a);
    }
    
    public void tan(double a){
        result = Math.tan(a);
    }


    public void log(double a){
        result = Math.log(a);
    }

    public void sqrt(double a){
        result = Math.sqrt(a);
    }

    public void cbrt(double a) {
        result = Math.cbrt(a);
    }

    @Override
    public void printResult(){
        System.out.println("Scientific Calculator Result:" + result);
    }

}
