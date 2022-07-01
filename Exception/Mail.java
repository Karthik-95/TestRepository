package Exception;

public class Mail {
	public static void main(String[] args) throws MailNotFoundException {
		String mail="k";
		try {
		if(mail.contains("@")) {
			System.out.println("Its Mail Id");
		}
		else {
			throw new MailNotFoundException();
		}
		}catch(MailNotFoundException x) {
			System.out.println(x);
		}
		
	}

}
