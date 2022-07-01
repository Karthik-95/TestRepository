package day17;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Karthik", 107, 20000, true);
		Student s2 = new Student("Ravi", 102, 25000, true);
		Student s3 = new Student("Thrisha", 106, 23000, false);
		Student s4 = new Student("Sathya", 104, 25000, false);
		Student s5 = new Student("Vijay", 103, 25000, true);
		ArrayList<Student> student = new ArrayList<>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		/*ArrayList<Student> male = new ArrayList<>();
		ArrayList<Student> female = new ArrayList<>();
		student.forEach((i) -> {
			if (i.getIsMale()) {
				male.add(i);
			} else {
				female.add(i);

			}
		});
		for (Student i : male) {
			System.out.println(i + "\n");
		}
		for (Student i : female) {
			System.out.println(i + "\n");
		}*/
		int tot=0;
		for(int i=0;i<student.size();i++) {
			tot=tot+i.getFees();
		}

	}

}
