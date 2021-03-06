package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
			List<Product> list = new ArrayList<>();
			
			list.add(new Product("TV", 1250.12));
			list.add(new Product("Carro", 8051.89));
			list.add(new Product("Computador", 5542.12));
				
			list.sort((p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
			
			for(Product p : list) {
				System.out.println(p);
			}
			
		sc.close();
	}
}
