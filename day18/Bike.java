package day18;

public class Bike {
	private String vehicleNumber;
	private String model;
	private int price;
	private int cc;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public Bike(String vehicleNumber, String model, int price, int cc) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.price = price;
		this.cc = cc;
	}
	public String toString() {
		return "vehicleNumber=" + vehicleNumber + ", model=" + model + ", price=" + price + ", cc=" + cc;
	}
	

}
