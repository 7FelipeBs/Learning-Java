import java.util.Locale; 
import java.util.Scanner;

import Entities.Triangle;

public class Operation {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		Triangle number;
		number = new Triangle();
		
		System.out.println("Enter the measures of triangle: ");
		number.a = sc.nextDouble();
		number.b = sc.nextDouble();
		number.c = sc.nextDouble();
		
		
		double area = number.calculate();
		System.out.printf("Triangle area: %.2f%n", area);
		sc.close();
	}

}
