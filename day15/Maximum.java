package day15;

public class Maximum {
	public String findMax(int num1, int num2) {
		if (num1 > num2) {
			return num1 + " is maximum";
		} else {
			return num2 + " is maximum";
		}
	}

	public String findMax(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1 + " is maximum";
		} else if (num2 > num1 && num2 > num3) {
			return num2 + " is maximum";
		} else {
			return num3 + " is maximum";
		}
	}

	public String findMax(String name1, String name2) {
		if (name1.length() > name2.length()) {
			return name1 + " is maximum";
		} else {
			return name2 + " is maximum";
		}
	}

}
