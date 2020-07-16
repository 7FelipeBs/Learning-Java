package ConvertDollar;

import java.util.Locale;
import java.util.Scanner;
import Entities.CurrencyConverter;

public class Index {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.printf("-------------WELCOME-------------");
			System.out.println();
			System.out.printf("How many dollars will be bought? ");
			double dollar = sc.nextDouble();
			System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.convert(dollar));
		sc.close();
	}

}
