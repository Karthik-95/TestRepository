package day17;

public class Student {
	private String name;
	private int id;
	private int fees;
	private boolean isMale;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setFees(int fees) {
		this.fees=fees;
	}
	public int getFees() {
		return fees;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public Student(String name,int id,int fees,boolean isMale) {
		this.name=name;
		this.id=id;
		this.fees=fees;
		this.isMale=isMale;
	}
	public String toString() {
		return "NAME: "+name+"\n"+"ID: "+id+"\n"+"FEES: "+fees+"\n"+"MALE: "+isMale;
	}
}


