package Exception;

public class MultiCatch {
	public static void main(String[] args) {
		String a="25";
		String b="5";
		String c="20";
		try {
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		int z=Integer.parseInt(c);
		int[] i= {x,y,z};
		System.out.println(i[0]+i[1]);
		System.out.println(i[7]);
		}/*catch(Exception e) {
			System.out.println(e);
		}*/
		catch(ArithmeticException a1) {
			System.out.println(a1);
		}
		catch(NumberFormatException a2) {
			System.out.println(a2);
		}
		catch (ArrayIndexOutOfBoundsException a3) {
			System.out.println(a3);
		}
		catch(StringIndexOutOfBoundsException a4) {
			System.out.println(a4);
		}
		catch(NullPointerException a5) {
			System.out.println(a5);
		}
		catch (Exception a6) {
			System.out.println(a6);
		}
		System.out.println("Hello");
	}

}
