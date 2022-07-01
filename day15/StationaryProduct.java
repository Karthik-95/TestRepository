package day15;

public class StationaryProduct extends Pencil {
	int noOfPencilBoxes;
	boolean isLed;

	public StationaryProduct(String brand, int price, String color, int noOfPencilBoxes, boolean isLed) {
		super(brand, price, color);
		this.noOfPencilBoxes = noOfPencilBoxes;
		this.isLed = isLed;
	}

	public String toString() {
		return "BRAND : " + super.brand + ", PRICE : " + super.price + ", COLOR : " + super.color
				+ ", NO OF PENCIL BOXES : " + noOfPencilBoxes + ", IS LED : " + isLed;
	}

}
