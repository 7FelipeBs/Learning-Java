package rectangleCalculate;

import java.util.Scanner;
import java.util.Locale;
import entities.calculate;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		calculate rectangle;
		rectangle = new calculate(4, 3);
		
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		System.out.println(rectangle.diagonal());
		sc.close();
	}
}
