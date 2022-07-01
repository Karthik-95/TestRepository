package day15;

public class UseMountainBike {
	public static void main(String[] args) {
		Bike b = new MountainBike("YAMAHA", 150000, "R15", 200, 300);
		System.out.println(b + "\n" + b.findNetprice(10));
	}

}
