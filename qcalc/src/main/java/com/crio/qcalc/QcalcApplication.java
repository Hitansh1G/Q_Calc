package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		// System.out.println("Hello world!");
		System.out.println("Starting QCalc..");
		StandardCalculator calc = new StandardCalculator();
		// calc.add(1, 2);
		// System.out.println(calc.getResult());

		calc.add(Double.MAX_VALUE, Double.MAX_VALUE);

		calc.printResult();
		

		
		
	}

}
/*
 * @Override annotation assures that the subclass method is overriding the parent class method. If
 * it is not so, compile time error occurs.
 * 
 * @SuppressWarnings annotation: is used to suppress warnings issued by the compiler.
 * 
 * @Deprecated annoation marks that this method is deprecated so compiler prints warning. It informs user that it may be removed in the future versions. So, it is better not to use such methods.
 * 
 * 
 */
