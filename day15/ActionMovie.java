package day15;

public class ActionMovie extends Movie{
	public String getFightSequance(int fight) {
		if (fight > 3 && fight < 4) {
			return "It has " + fight + "fights it is normal movie";
		} 
		else if (fight == 4) {
			return "It has " + fight + " fight good action movie";
		} 
		else if (fight > 4) {
			return "it has" + fight + " fights full packed action movie";
		}
		else {
			return "Its a Movie";
		}
	}

}
