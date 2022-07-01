package day15;

public class MountainBike extends Bike {
	int climbingSpeed;
	int engineCc;

	MountainBike(String brand, int price, String model, int climbingSpeed, int engineCc) {
		super(brand, price, model);
		this.climbingSpeed = climbingSpeed;
		this.engineCc = engineCc;
	}

	public String toString() {
		return "BRAND : " + super.brand + " " + "PRICE : " + super.price + " " + "MODEL : " + super.model
				+ "CLIMBING SPEED : " + climbingSpeed + "ENGINE SPEED : " + engineCc;

	}

}
