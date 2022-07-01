package day17;

public class Programer {
	String name;
	String designation;
	String codingLanguage;
	boolean isMale;
	public Programer(String name,String designation,String codingLanguage,boolean isMale) {
		this.name=name;
		this.designation=designation;
		this.codingLanguage=codingLanguage;
		this.isMale=isMale;
	}
	public String toString() {
		return "Name : "+name+" /"+" Designation : "+designation+" /"+" CodingLanguage : "+codingLanguage+" /"+" Male : "+isMale;
	}

}
