package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	public static void main(String[] args) {
		ArrayList<String>empName=new ArrayList<>();
		empName.add("Karthik");
		empName.add("Sathya");
		empName.add("Ravi");
		empName.add("Mani");
		//empName.stream().map(x->x.toUpperCase()).forEach(z->System.out.println(z));
		List<String>l=empName.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		//System.out.println(l);
		l.forEach(i->{
			//System.out.println(i);
			});
		//empName.stream().map(x->x.length()>4).forEach(z->System.out.println(z));
		List<Boolean>b=empName.stream().map(x->x.length()>4).collect(Collectors.toList());
		//System.out.println(b);
		//empName.stream().map(x->x.charAt(x.length()-1)).forEach(z->System.out.println(z));
		List<Character>c=empName.stream().map(x->x.charAt(x.length()-1)).collect(Collectors.toList());
		//c.forEach(x->System.out.println(x));
		//empName.stream().map(x->x.length()+10).forEach(z->System.out.println(z));
		List<Integer>i=empName.stream().map(x->x.length()+10).collect(Collectors.toList());
		//i.forEach(z->System.out.println(z));
		//empName.stream().filter(x->x.contains("t")).forEach(z->System.out.println(z));
		List<String>n=empName.stream().filter(x->x.contains("t")).collect(Collectors.toList());
		n.forEach(z->System.out.println(z));
	}

}
