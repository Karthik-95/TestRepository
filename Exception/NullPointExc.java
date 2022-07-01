package Exception;

public class NullPointExc {
	public static void main(String[] args) {
		//String a="Karthik";
		String a=null;
		int b=0;
		try {
			b=a.length();
		}catch(NullPointerException a1) {
			//System.out.println(a1);
			System.out.println("Please dont give String null");
		}
		System.out.println(b);
		System.out.println("Hello");
	}

}
