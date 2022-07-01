package day18;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {
	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Karthik");
		Employee emp2=new Employee(102,"Sathya");
		Employee emp3=new Employee(103,"Ravi");
		Employee emp4=new Employee(104,"Thrisha");
		HashMap<Integer,Employee>emps=new HashMap<>();
		emps.put(emp1.getId(), emp1);
		emps.put(emp2.getId(), emp2);
		emps.put(emp3.getId(), emp3);
		emps.put(emp4.getId(), emp4);
		/*emps.values().forEach((i)->{
			//System.out.println(i);
		});
		Iterator<Employee>k=emps.values().iterator();
		while(k.hasNext()) {
			if(k.next().getId()==102) {
				k.remove();
			}
		}
		System.out.println(emps);*/
		emps.forEach((i,o)->{
			System.out.println(i+" -"+o);
		});
	}

}
