package Index;

import java.util.Locale;
import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner;
import Entities.Employee;

public class Index {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
			
			System.out.printf("How many employees will be registered? ");
			int cont = sc.nextInt();
			
			Employee employee = new Employee();
			List<Employee> list = new ArrayList<>();
			for(int i = 0; i < cont; i++) {
				System.out.printf("Employee #%d%n", i + 1);
				System.out.printf("Id: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.printf("Name: ");
				String name = sc.nextLine();
				
				System.out.printf("Salary: ");
				double salary = sc.nextDouble();
				
				employee = new Employee(id, name, salary);
				list.add(employee);
				System.out.println();
			}
			
				System.out.printf("Enter the percentage: ");
				double percentue = sc.nextDouble();
				
				System.out.printf("Enter the employee id that will have salary increase: ");
				int idIncrease = sc.nextInt();
			
				for(Employee var : list){
					if(var.Id.equals(idIncrease)) {
						var.Increase(percentue, var.Id);
					}
				}
				
				System.out.println();
			for(Employee var : list){
				System.out.println(var);
			}
		sc.close();
	}
}
