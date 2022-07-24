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



//What does this weird @ symbol mean?
// It is called Java Annotation which is a tag that represents the metadata it is attached to class , interface , methods or feilds to indicate some more information which can be used by java compiler

