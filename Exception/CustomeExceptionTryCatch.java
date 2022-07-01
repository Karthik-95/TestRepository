package Exception;

public class CustomeExceptionTryCatch {
	public static void main(String[] args) {
		int age=16;
		try {
			if(age>=18) {
				System.out.println("Eligible");
			}
			else {
				throw new AgeException();
			}
		}catch(AgeException x) {
			System.out.println("Age under 18");
		}
	}

}
