package Exception;

public class ArrayIndexOut {
	public static void main(String[] args) {
		String a="Karthik";
		int[] b= {1,2,3,4,5,6};
		try {
		//System.out.println(a.charAt(8));
		System.out.println(a.charAt(4));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("NO character at this position");
		}
		try {
			System.out.println(b[5]);
		//System.out.println(b[9]);
		}catch(ArrayIndexOutOfBoundsException w) {
			System.out.println("Index of array out of Range");
		}
	}

}
