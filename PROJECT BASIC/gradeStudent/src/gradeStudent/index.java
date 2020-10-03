package gradeStudent;

import java.util.Locale;
import java.util.Scanner;
import Entities.Student;

public class index {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
			System.out.printf("Name: ");
			String name = sc.nextLine();
			
			System.out.printf("Grade 1: ");
			double grade1 = sc.nextDouble();
			
			System.out.printf("Grade 2: ");
			double grade2 = sc.nextDouble();
			
			System.out.printf("Grade 3: ");
			double grade3 = sc.nextDouble();
			
			Student student = new Student(name, grade1, grade2, grade3);
			
			if(student.resultGrades() <= 60) {
				double rest = 60 - student.resultGrades();
				System.out.printf("FINAL GRADE: %.2f\n", student.resultGrades());
				System.out.printf("FAILED \n");
				System.out.printf("MISSING %.2f POINTS \n", rest);
			} else {
				System.out.printf("FINAL GRADE: %.2f\n", student.resultGrades());
				System.out.println("PASS");
			}
		sc.close();
	}
}
