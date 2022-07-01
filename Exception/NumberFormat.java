package Exception;

public class NumberFormat {
	public static void main(String[] args) {
		String a="ka";
		int b=0;
		try {
		b=Integer.parseInt(a);
		//System.out.println(b);
		}catch(NumberFormatException e) {
			//System.out.println(e);
			System.out.println("Please use numbers to convert");
		}
		System.out.println(b);
		System.out.println("hi");
	}

}
