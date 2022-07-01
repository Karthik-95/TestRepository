package day16;

public class OnlineCourse implements Course {
	String studentName;
	
	public String showCourseId(int id) {
		return "Course ID : "+id;
	}
	
	public String showCourseFees(String courseName) {
		String fees="";
		if(courseName.equalsIgnoreCase("JAVA")) {
			 fees="JAVA FEES IS 5000";
		}
		else if(courseName.equalsIgnoreCase("PYTHON")) {
			 fees="PYTHON FEES IS 4000";
		}
		else if(courseName.equalsIgnoreCase("C++")) {
			 fees="C++ FEES IS 3000";
		}
		else {
			 fees="INVALID";
	
		}
		return fees;
	}

}
