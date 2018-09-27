package carLoan;

import static org.junit.Assert.*;

import org.junit.Test;

public class carLoanTest {

	@Test
	public void test1() {
		Loan car = new Loan(35000,.1,0,5);
		
		System.out.println(car.monthlyPayment());
		System.out.println(car.interestSpent());
		
	}


}
