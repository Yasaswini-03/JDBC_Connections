package generics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Stringbuilder {
	public static void main(String[] args) {
		try
		 {
			BufferedWriter bw = new BufferedWriter(new FileWriter("index.html"));
			bw.write("welcome to Tech Mahindra training");
			bw.close();
			BufferedReader br = new BufferedReader(new FileReader("index.html"));
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}

}
