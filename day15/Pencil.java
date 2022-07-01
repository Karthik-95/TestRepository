package day15;

public class Pencil {
	String brand;
	int price;
	String color;

	public String findNetprice(int discountPercentage) {
		return "NET PRICE : " + (price - price * discountPercentage / 100);
	}

	public Pencil(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	/*public String toString() {
		return brand + ", PRICE : " + price + ", COLOR : " + color;
	}*/

}
