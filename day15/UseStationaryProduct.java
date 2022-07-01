package day15;

public class UseStationaryProduct {
	public static void main(String[] args) {
		Pencil p = new StationaryProduct("NATRAJ", 20, "BLACK", 5, false);
		System.out.println(p + "\n" + p.findNetprice(10));
	}

}
