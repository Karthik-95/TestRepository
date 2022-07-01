package day16;

public class AxisBank implements Bank {
		String branch;
		public int getRateofInterest(int per,int amt) {
			return amt*per/100;
		}
}
