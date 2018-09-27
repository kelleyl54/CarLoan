package carLoan;

import static org.junit.Assert.*;

import org.junit.Test;

public class carLoanTest {

	/*
	 * A value of ~ .0868 for the annual interest rate will yield the results described in the quiz
	 * question. The slight difference may be due to the formula used to calculate interest.
	 * However, by setting the rate at 8.68%, both of the values described in the question are 
	 * produced. 
	 */
	
	@Test
	public void test1() {
		Loan car = new Loan(35000,.0868,0,5);
		
		System.out.println("The monthly payment is $" + String.format("%.5g%n", car.monthlyPayment()));
		System.out.println("The total amount spent on interest over the course of the loan is $" + String.format("%.6g%n", car.interestSpent()));
		System.out.println();
		
	}
	
	@Test
	public void test2() {
		Loan car = new Loan(35000,.1,0,5);
		
		System.out.println("The monthly payment is $" + String.format("%.5g%n", car.monthlyPayment()));
		System.out.println("The total amount spent on interest over the course of the loan is $" + String.format("%.7g%n", car.interestSpent()));
		System.out.println();
		
	}


}
