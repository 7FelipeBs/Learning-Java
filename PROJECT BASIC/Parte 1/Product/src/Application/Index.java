package Application;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Entities.Product;
import Entities.ImportedProduct;
import Entities.UserProduct;

public class Index {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList();
		
		System.out.print("Enter the number of products: ");
		int n = scanner.nextInt();
			
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char choice = scanner.next().charAt(0);
			
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Price: ");
			double price = scanner.nextDouble();
			
			if(choice == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = scanner.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
			else if(choice == 'u') {
				System.out.printf("Manufacture date (DD/MM/YYYY): ");
				Date date = simpleDate.parse(scanner.next());
				list.add(new UserProduct(name, price, date));
			} 
			else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product prod : list) {
			System.out.println(prod.PriceTag());
		}
		scanner.close();
	}
}
