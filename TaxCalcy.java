package com.arpita.java;


	import java.util.Scanner;
	import edu.westga.taxcalculator.model.TaxReturn;

	public class TaxCalcy {
	    public static void main(String[] args) {
	        System.out.println("Please enter your income: ");
	        Scanner theScanner = new Scanner(System.in);
	        double income = theScanner.nextDouble();
	        TaxReturn theCalculator = new TaxReturn(income);
	        System.out.println("The amount of tax is: " + taxReturn.getTax());
	    }
	}
}
