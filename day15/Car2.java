package day15;

public class Car2 extends Car1 {
	public Car2 (String brand,int price,int speed) {
		super(brand,price);
		this.speed=speed;
	}
	public String showSpeed(int speed) {
		return "Brand : "+super.brand+", Price : "+super.price+", Speed : "+speed;
	}
	

}
