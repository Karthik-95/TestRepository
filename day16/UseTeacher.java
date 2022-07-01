package day16;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher tech=new Teacher();
		System.out.println(tech.name("Karthik")+"\n"+tech.showSalary(50000)+"\n"+tech.showDepartment("Science")+"\n"+tech.showWorkingSector("Physics Teacher"));
	}

}
