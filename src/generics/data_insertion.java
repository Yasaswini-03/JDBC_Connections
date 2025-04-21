package generics;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class data_insertion {
	public static void main(String[] args) {
		String feedback = "Issue Resolved";
		try (
				FileWriter fw = new FileWriter("data.txt"); 
				) {
			fw.write(feedback);
			System.out.println("data inserted");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (
				FileReader fr = new FileReader("data.txt");
				){
			StringBuilder sb = new StringBuilder();
			
			int character;
			while((character = fr.read()) != -1) {
				sb.append((char)character);
			}
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
