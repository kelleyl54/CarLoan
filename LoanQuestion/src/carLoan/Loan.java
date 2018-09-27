package carLoan;

public class Loan {
	
	private double carCost; // total cost of the car
	private double interestRate; //rate of interest for the loan of the car
	private double downPayment; //initial down payment, does not count towards interest
	private int loanLength; //length of the loan, in years
	
	public Loan(double carCost, double interestRate, double downPayment, int loanLength) {
		super();
		this.carCost = carCost;
		this.interestRate = interestRate;
		this.downPayment = downPayment;
		this.loanLength = loanLength;
	}
	
	/*
	 * This method first calculates the cost of the car that interest will apply to. Then, it finds the 
	 * payment per year based on the annual interest rate. Finally, it divides the yearly cost by 12 
	 * to find the monthly payment. 
	 * 
	 * Interest calculated using the formula P = (rate*initialValue)/(1-(1+rate)^(-1*number of periods))
	 * 
	 */
	
	public double monthlyPayment() {
		
		double interestAppliesTo = carCost-downPayment;
		
		double paymentPerYear = (interestRate*interestAppliesTo)/(1-Math.pow(1+interestRate, -1*loanLength));
		
		return paymentPerYear/12;			
		
	}
	
	/*
	 * This method takes the monthly payment and finds out how much was spent over the course of the
	 * loan. Then it subtracts the amount of the loan that the interest applies to and subtracts
	 * that amount from the total cost. The result is the amount of money spent 
	 * on interest alone.
	 */
	
	public double interestSpent() {
		
		double payment = monthlyPayment();
		
		double totalSpent = payment * (loanLength*12);
		
		double interestSpent = totalSpent-(carCost - downPayment) ;
		
		return interestSpent;
	}
	
}
