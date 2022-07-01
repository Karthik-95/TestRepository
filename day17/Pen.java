package day17;

import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		ArrayList<String>name=new ArrayList<>();
		name.add("Cello");
		name.add("Montex");
		name.add("Roriyo");
		name.add("Reynolds");
		name.add("Karthik");
		name.add("Jgs");
		name.add("hhs");
		/*for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		int a=0;
		String b="";
		for(String i:name) {
			if(i.length()>a) {
				a=i.length();
				b=i;
			}
		}
		System.out.println(b+"-"+a);*/
		name.forEach((i)->{System.out.println(i);});
	}

}
