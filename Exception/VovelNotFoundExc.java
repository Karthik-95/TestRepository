package Exception;

public class VovelNotFoundExc {
	public static void main(String[] args)throws VovelNotFoundException {
		String name="Kkh";
		try {
		if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")) {
			System.out.println("Vovel Present");
		}
		else {
			throw new VovelNotFoundException("No Vovel");
		}
		}catch(VovelNotFoundException e) {
			System.out.println(e);
			//System.out.println(e.getMessage());
			//System.out.println("Vovels not Found");
		}
		
	}

}
