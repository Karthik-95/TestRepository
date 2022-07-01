package day15;

public class SportCar extends Car {
	public SportCar(String brand,int price,int Cc){
		super(brand,price);
			this.Cc=Cc;
		}
	public String showSpeed(int Cc) {
		return "SportsCarSpeed = "+Cc;
	}}
