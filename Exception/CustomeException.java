package Exception;

public class CustomeException {
	public static void main(String[] args) throws AgeException {
		int age=5;
		try {
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new AgeException("Under Age");
		}
		}catch(AgeException x) {
			System.out.println(x);
			//System.out.println(x.getMessage());
		}
	}

}
