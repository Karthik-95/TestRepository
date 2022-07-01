package day16;

public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.branch="I G P";
		System.out.println(axis.branch);
		System.out.println(axis.getRateofInterest(8, 500000));
	}

}
