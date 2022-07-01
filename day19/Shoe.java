package day19;

public class Shoe {
	private String brand;
	private int size;
	private int price;
	private boolean isWarranty;
	private String shoeType;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public String getShoeType() {
		return shoeType;
	}
	public void setShoeType(String shoeType) {
		this.shoeType = shoeType;
	}
	public Shoe(String brand, int size, int price, boolean isWarranty, String shoeType) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.isWarranty = isWarranty;
		this.shoeType = shoeType;
	}
	public String toString() {
		return "brand=" + brand + ", size=" + size + ", price=" + price + ", isWarranty=" + isWarranty
				+ ", shoeType=" + shoeType;
	}
	

}
