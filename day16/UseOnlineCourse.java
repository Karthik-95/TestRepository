package day16;

public class UseOnlineCourse {
	public static void main(String[] args) {
		OnlineCourse course=new OnlineCourse();
		course.studentName="KARTHIK";
		System.out.println("Student Name : "+course.studentName+"\n"+course.showCourseId(9777)+"\n"+course.showCourseFees("python"));
	}

}
