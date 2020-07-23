package Application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.DomainException;
public class Index {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		
		Account account = new Account(holder, withdrawLimit, initialBalance, number);
		
		try {
			account.withdraw(withdraw);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		}
		
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	}

}
