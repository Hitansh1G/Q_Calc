
package com.crio.qcalc;

/*
The package statement is necessary every time you create a new class in a Java project. It is Java’s way to tell the compiler the location of the class you are creating. So that is what the package statement does, but what is a "package" itself?

In simple terms, it is something that allows groups of related things in Java to exist together. The official definition is: "A package is a grouping of related types providing access protection and name space management."
*/
public class StandardCalculator {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int value) {
        this.result = value;
    }

    public void add(int num1, int num2) {
        result = num1 + num2;
    }

}

// public int subtract(int num1, int num2)

// public int multiply(int num1, int num2)

// public int divide(int num1, int num2)

// public static void getVersion(){
/*
 * The static keyword indicates that the particular member belongs to a type
 * itself, rather than to an instance of that type. This means that only one
 * instance of that static member is created which is shared across all
 * instances of the class.
 */
