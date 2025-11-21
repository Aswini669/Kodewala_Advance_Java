package spack;

public class MarksVerify {

	public String verifyGrades(int marks) {
		
		if(marks < 30) {
			return "F";
		}
		else if(marks>30 && marks<59) {
			return "D";
		}
		else if(marks>60 && marks<79) {
			return "C";
		}
		else if(marks>80 && marks<89) {
			return "B";
		}
		else {
			return "A";
		}
	}
}
