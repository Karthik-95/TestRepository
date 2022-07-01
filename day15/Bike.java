package day15;

public class Bike {
	String brand;
	int price;
	String model;

	public String findNetprice(int taxPercentage) {
		return "NET PRICE : " + (price + price * taxPercentage / 100);
	}

	Bike(String brand, int price, String model) {
		this.brand = brand;
		this.price = price;
		this.model = model;
	}

	public String toString() {
		return brand + " " + price + " " + model;
	}

}
