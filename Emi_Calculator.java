package com.corejava;

/**
* EMI calculator and output total monthly EMI print
* Calculate EMI usis Class, Object, Variables, Operators, and Datatypes.
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
class Calculation {
	
	public Calculation(float amount, float rate, float time) {
		float emi;

		rate = rate / (12 * 100); // One month interest
		time = time * 12; // One month period
        emi = (amount * rate * (float)Math.pow(1 + rate, time)) / (float)(Math.pow(1 + rate, time) - 1);
        
        System.out.println("Monthly EMI is = " + emi);
	}

}
public class Emi_Calculator {

	public static void main(String[] args) {
		float amount, rate, time; // Variables and Datatypes
		amount = 15000;
		rate = 10;
		time = 2;
		
		Calculation emi = new Calculation(amount, rate, time); // Object	
	}

}
