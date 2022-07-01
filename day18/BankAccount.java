package day18;

public class BankAccount {
	private String bankName;
	private String accountHolderName;
	private int accountNumber;
	private int accountBalance;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public BankAccount(String bankName, String accountHolderName, int accountNumber, int accountBalance) {
		this.bankName = bankName;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String toString() {
		return "BankName=" + bankName +"\n"+ "AccountHolderName=" + accountHolderName +"\n"+ "AccountNumber=" + accountNumber
				+"\n"+ "AccountBalance=" + accountBalance;
	}

}
