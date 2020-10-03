package increaseSalary;

import Entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.printf("Name: ");
			String name = sc.nextLine();
			
			System.out.printf("Gross Salary: ");
			double grossSalary = sc.nextDouble();
			
			System.out.printf("Tax: ");
			double tax = sc.nextDouble();
			
			Employee employee = new Employee(grossSalary, tax, name);
			
			System.out.printf("Employee: " + employee.getName() + ", $%.2f\n", employee.NetSalary());
			
			System.out.printf("Which percentage to increase salary? ");
			double percentue = sc.nextDouble();
			
			employee.increaseSalary(percentue);
			System.out.printf("Employee: " + employee.getName() + ", $%.2f\n", employee.NetSalary());
		sc.close();
	}
}
