package day18;

import java.util.HashMap;
import java.util.Iterator;

public class UseBankAccount {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("HDFC", "Karthik", 1101, 500000);
		BankAccount account2 = new BankAccount("IndianBank", "Sathya", 1609, 60000);
		BankAccount account3 = new BankAccount("StateBank", "Ravi", 1090, 80000);
		BankAccount account4 = new BankAccount("IOB", "Saravanan", 1604, 100000);
		BankAccount account5 = new BankAccount("ICICI", "Thrisha", 1607, 60000);
		BankAccount account6=new BankAccount("ICICI","Selva",1035,35000);
		HashMap<Integer, BankAccount> accountDetails = new HashMap<>();
		accountDetails.put(account1.getAccountNumber(), account1);
		accountDetails.put(account2.getAccountNumber(), account2);
		accountDetails.put(account3.getAccountNumber(), account3);
		accountDetails.put(account4.getAccountNumber(), account4);
		accountDetails.put(account5.getAccountNumber(), account5);

		/*for (BankAccount i : accountDetails.values()) {
			System.out.println(i+"\n");
			}*/
		/*
		 * for (Integer i : accountDetails.keySet()) { System.out.println(i); }
		 */
		/*for(Integer i:accountDetails.keySet()) {
			String BankName=accountDetails.get(i).getBankName();
			System.out.println(BankName);
		}*/
		/*for(Integer i:accountDetails.keySet()) {
			int acNo=accountDetails.get(i).getAccountNumber();
			System.out.println(acNo);
		}*/
		//accountDetails.keySet().forEach((i)->{ System.out.println(i);});
		//accountDetails.values().forEach((i)->(System.out.println(i.getBankName());)
		//Iterator<Integer>l=accountDetails.keySet().iterator();
		/*while(l.hasNext()) {
			System.out.println(l.next().getAccountNumber());
		}*/
		/*Iterator<BankAccount>k=accountDetails.values().iterator();
		while(k.hasNext()) {
			System.out.println(k.next().getAccountHolderName());
		}*/
		Iterator<BankAccount>k=accountDetails.values().iterator();
		while(k.hasNext()) {
			if(k.next().getAccountBalance()<=40000) {
				k.remove();
			}
			
		}
		System.out.println(accountDetails);

	}

}
