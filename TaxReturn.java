package com.arpita.java;

public class TaxReturn {
	   private double income;

	    /**
	     * Constructor for the TaxReturn class
	     * 
	     * @param income
	     *            the income of the person.
	     */
	    public TaxReturn(double income) {
	        if (income < 0) {
	            throw new IllegalArgumentException(
	                    "Income can't be less than zero.");
	        }
	        this.income = income;
	    }

	    public void getTax() {
	        if (income <= 50000) {
	            income *= 0.01;
	        } else if (income <= 75000) {
	            income *= 0.02;
	        } else if (income <= 100000) {
	            income *= 0.03;
	        } else if (income <= 250000) {
	            income *= 0.04;
	        } else if (income <= 500000) {
	            income *= 0.05;
	        } else
	            income *= 0.06;

	    }
}
