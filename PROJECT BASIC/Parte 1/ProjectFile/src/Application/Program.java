package Application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Fileswork;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String path = "E:\\Temp\\ws-eclipse\\ProjectFile\\sourcefile.csv";
		String pathOut = "E:\\Temp\\ws-eclipse\\ProjectFile\\outfile.csv";
		
		List<Fileswork> list = new ArrayList();
		
		try (BufferedReader bfReader = new BufferedReader(new FileReader(path))){
				BufferedWriter bfWrite = new BufferedWriter(new FileWriter(pathOut, true));
				String line;
				while((line = bfReader.readLine()) != null){
					String []itens = line.split(",");
					
					String Name = itens[0].trim();
					double Price = Double.valueOf(itens[1].trim());
					int Quantity = Integer.parseInt(itens[2].trim());

					list.add(new Fileswork(Name, Quantity, Price));
					System.out.println(Name + "," + Price + ", " + Quantity);
				}
				
				System.out.println();
				
				for(Fileswork var : list) {
					bfWrite.write(var.getName() + ", " + var.totalValue());;
					bfWrite.newLine();
					
				}
				bfWrite.close();
				bfReader.close();
		}
		catch(IOException e) {
				System.out.println("Error" + e.getMessage());
				e.getStackTrace();
		}
		sc.close();
	}
}
