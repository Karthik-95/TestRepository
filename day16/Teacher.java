package day16;

public class Teacher implements Employee {
	public String name(String name) {
		return "Staff Name : "+ name;
	}
	public String showSalary(int salary) {
		return "Staff Salary : "+salary;
	}
	public String showDepartment(String department) {
		return "Staff Department : "+department;
	}
	public String showWorkingSector(String sector) {
		return "Staff Working Sector : "+sector;
	}

}
