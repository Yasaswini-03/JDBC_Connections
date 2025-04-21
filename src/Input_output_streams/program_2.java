package Input_output_streams;

import java.io.File;
import java.io.IOException;

public class program_2 {
	public static void main(String[] args) {
		File f = new File("index.html");
		try {
			if(f.createNewFile()) {
				System.out.println("file is successfully created" + f.getName());
			}
			else {
				System.out.println("file is not created");
			}
			System.out.println("absolute path: " + f.getAbsolutePath());
			System.out.println("read" + f.canRead());
			System.out.println("write" + f.canWrite());
			System.out.println("length" + f.length());
			System.out.println("file" + f.isFile());
			System.out.println("directory" + f.isDirectory());
		} 
		
		catch (IOException e) {
			e.printStackTrace();
			
		}
	}

}
