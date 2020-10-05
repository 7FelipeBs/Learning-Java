package Index;

import java.util.Locale;
import java.util.Scanner;
import Entities.RoomRental;

public class Index {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
			
			RoomRental[] roomRental = new RoomRental[3];
			
			for(int i = 0; i < roomRental.length; i++) {
				System.out.printf("Rent #%d%n", i + 1);
				
				System.out.printf("Name: ");
				String name = scanner.nextLine();
				System.out.printf("Email: ");
				String email = scanner.nextLine();
				System.out.printf("Room: ");
				int room = scanner.nextInt();
				scanner.nextLine();
				roomRental[i] = new RoomRental(name, email, room);
				System.out.println();
			}
			
			for(int i = 0; i < roomRental.length; i++) {
				int cont = i + 1;
				System.out.println( cont + ": " + roomRental[i]);
			}
		scanner.close();
	}

}
