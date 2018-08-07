package oopsconcepts;

public class Addingmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findGrades("John", 90);
		findGrades("Tom", 80);
		findGrades("Dan", 60);
	}

	
	public static void findGrades(String studentName, int score) {
	
	String grade;
	if (score >= 90 && score <= 100) {
		grade = "A";
	} else if (score >= 80 && score < 90) {
		grade = "B";
	}
	else if (score >= 70 && score < 80) {
			grade = "C";
		}
			else {
				grade = "D";
			}
	
	System.out.println( "Grade of " + studentName + " is:  " + grade);
	}

		
public static void displayGrades() {
	
}
}
	