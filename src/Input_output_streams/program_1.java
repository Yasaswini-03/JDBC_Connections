package Input_output_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class program_1 {
	public static void main(String[] args) {
		String sourcepath = "D:/OneDrive/Pictures/Screenshots/Screenshot 2024-07-03 125150.png";
		String destinationpath = "D:/OneDrive/Desktop/Yashu/puppy.jpg";
		try(
				FileInputStream fis = new FileInputStream(sourcepath);
				FileOutputStream fos = new FileOutputStream(destinationpath)
				) {
			byte[] buffer = new byte[1024];
			int byteread;
			while((byteread = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteread);
			}
			System.out.println("Successfully created");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
