package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
			List<Product> list = new ArrayList<>();
			
			list.add(new Product("TV", 1250.12));
			list.add(new Product("Carro", 8051.89));
			list.add(new Product("Computador", 5542.12));
			list.add(new Product("Tablet", 680.22));
				
			//list.removeIf(Product::nonStaticProductPredicate);
			//Predicate<Product> pred = p -> p.getPrice() <= 1500.00;
			list.removeIf(p -> p.getPrice() <= 1500.00);
			for(Product p : list) {
				System.out.println(p);
			}
			
		sc.close();

	}

}
