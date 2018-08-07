package oopsconcepts;

public class methodreturn {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String grade;
			
		
			grade = findGrades(90);
			displayGrades("John", grade);
			
			grade = findGrades(80);
			displayGrades ("Tom", grade);
			
			grade = findGrades(60);
			displayGrades ("Dan", grade);
		}

		
		public static String findGrades( int score) {
		
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
		return grade;
		
		
		}

			
	public static void displayGrades(String studentName, String grade) {
		System.out.println("*****************************");
		System.out.println( "Grade of " + studentName + " is:  " + grade);
		System.out.println("*****************************");
	}
	}