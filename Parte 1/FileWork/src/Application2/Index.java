package Application2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Index {

	public static void main(String[] args) {
		
		String [] lines = new String[] { "Good morning", "Good afternoon", "Good Night"};
		String path = "E:\\Temp\\ws-eclipse\\out.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.getStackTrace();
		}
	}
}
