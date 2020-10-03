package Entities;

public class Student {
	String Name;
	
	Double Grade1, Grade2, Grade3;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getGrade1() {
		return Grade1;
	}

	public void setGrade1(Double grade1) {
		Grade1 = grade1;
	}

	public Double getGrade2() {
		return Grade2;
	}

	public void setGrade2(Double grade2) {
		Grade2 = grade2;
	}

	public Double getGrade3() {
		return Grade3;
	}

	public void setGrade3(Double grade3) {
		Grade3 = grade3;
	}
	
	public Student() {
		super();
	}

	public Student(String name, Double grade1, Double grade2, Double grade3) {
		super();
		Name = name;
		Grade1 = grade1;
		Grade2 = grade2;
		Grade3 = grade3;
	}
	
	
	public double resultGrades() {
		return Grade1 + Grade2 + Grade3;
	}
}
