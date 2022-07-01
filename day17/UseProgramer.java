package day17;

import java.util.ArrayList;

public class UseProgramer {
	public static void main(String[] args) {
		Programer p1 = new Programer("Karthik", "TeamLeader", "Java", true);
		Programer p2 = new Programer("Sathya", "Project Manager", "Java", false);
		Programer p3 = new Programer("Ravi", "Developer", "Python", true);
		Programer p4 = new Programer("Mani", "Developer", "Java", true);
		Programer p5 = new Programer("Thrisha", "HR Manager", "Java", false);
		ArrayList<Programer> programer = new ArrayList<>();
		programer.add(p1);
		programer.add(p2);
		programer.add(p3);
		programer.add(p4);
		programer.add(p5);
		/*
		 * for(int i=0;i<programer.size();i++) {
		 * System.out.println(programer.get(i)+"\n");
		 * 
		 * } String a=""; for(Programer i:programer) { a=a+i.name+" "; }
		 * System.out.println(a);
		 */
		int a = 0;
		String b = "";
		for (Programer i : programer) {
			if (a < i.name.length()) {
				a = i.name.length();
				b = i.name;
			}

		}
		System.out.println(b + "-" + a);

	}

}
