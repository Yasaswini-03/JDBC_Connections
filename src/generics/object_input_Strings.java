package generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	 String name;
	 int id;
	public Student(int id,String name) {
		this.name = name;
		this.id = id;
	}
}
public class object_input_Strings {
	public static void main(String[] args) {
		Student S = new Student(556, "yasaswini");
		try {
			ObjectOutputStream O = new ObjectOutputStream(new FileOutputStream("file.txt"));
			O.writeObject(S);
			System.out.println("Data is Inserted");
			O.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream o = new ObjectInputStream(new FileInputStream("file.txt"));
			Student s = (Student) o.readObject();
			System.out.println(s.id+ ":" +s.name);
			o.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
