package day15;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		c.brand="BMW";
		c.price=500000;
		System.out.println("Brand : "+c.brand+", Price : "+c.price+", Speed"+c.showSpeed(120));
		SportCar s=new SportCar();
		System.out.println(s.showSpeed(200));
	}

}
