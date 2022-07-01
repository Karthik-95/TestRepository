package day15;

public class UseBank {
	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println(b.findLoanEligibility() + "\n" + b.findLoanEligibility(35000) + "\n"
				+ b.findLoanEligibility(35000, 5000000));
	}

}
