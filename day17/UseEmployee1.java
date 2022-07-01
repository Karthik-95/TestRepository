package day17;

import java.util.ArrayList;

public class UseEmployee1 {
	public static void main(String[] args) {
	Employee emp1=new Employee();
	emp1.name="Karthik";
	emp1.gender="Male";
	emp1.id=107;
	emp1.salary=35000;
	Employee emp2=new Employee();
	emp2.name="Sathya";
	emp2.id=103;
	emp2.gender="Female";
	emp2.salary=30000;
	Employee emp3=new Employee();
	emp3.name="RaviKumar";
	emp3.id=105;
	emp3.gender="Male";
	emp3.salary=40000;
	Employee emp4=new Employee();
	emp4.name="Thrisha";
	emp4.id=106;
	emp4.gender="Female";
	emp4.salary=35000;
	Employee emp5=new Employee();
	emp5.name="Mani";
	emp5.id=101;
	emp5.gender="Male";
	emp5.salary=30000;
	ArrayList<Employee>employees=new ArrayList<>();
	employees.add(emp1);
	employees.add(emp2);
	employees.add(emp3);
	employees.add(emp4);
	employees.add(emp5);
	employees.forEach((i)->{System.out.println(i);});
	}

}
