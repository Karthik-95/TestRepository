package day15;

public class Bank {
	public int findLoanEligibility() {
		return 30000;
	}

	public int findLoanEligibility(int salary) {
		return 10 * salary + 30000;
	}

	public int findLoanEligibility(int salary, int propertyvalue) {
		return (propertyvalue / 5) + (10 * salary) + 30000;
	}

}
