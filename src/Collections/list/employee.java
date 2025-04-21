package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class employee {
	private int id;
	private String name;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public employee(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		List<employee> li = new ArrayList<>();
		employee e = new employee();
		e.setId(1);
		e.setName("yasaswini");
		e.setEmail("yashu@gmail.com");
		e.setPassword("yashu@1234");
		
		System.out.println(e);
		
		
		
	}

}
