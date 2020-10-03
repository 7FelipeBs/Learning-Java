package Application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		
		String path = "E:\\Temp\\ws-eclipse\\text.txt";
	
		try (BufferedReader buffered = new BufferedReader(new FileReader(path))){
			
			String line = buffered.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = buffered.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			
		}
	}
}
