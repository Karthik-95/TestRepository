package day18;

import java.util.HashMap;

public class TestDetails {
	public static void main(String[] args) {
		HashMap<Integer, String>testDetails=new HashMap<>();
		testDetails.put(203, "Sachin");
		testDetails.put(207,"Dhoni");
		testDetails.put(201, "Virat");
		testDetails.put(209, "Rohith");
		//testDetails.remove(203);
		//testDetails.put(209, "Pandiya");
		//System.out.println(testDetails.keySet());
		System.out.println(testDetails.values());
	}

}
