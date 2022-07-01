package Exception;

public class ArithmeticExcepionExample {
	public static void main(String[] args) {
		System.out.println("Good Morning");
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}catch(ArithmeticException e) {
			//System.out.println(e);
			System.out.println("Don't divide by Zero");
		}
		System.out.println("Hi");
		System.out.println("Hello");
	}

}
