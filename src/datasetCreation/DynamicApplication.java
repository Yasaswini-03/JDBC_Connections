package datasetCreation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DynamicApplication {
	private static final String Driver="com.mysql.cj.jdbc.Driver";
	private static Connection conn;
	private static final String username="root";
	private static final String password="root";
	private static PreparedStatement pmst;
	
	public static void main(String[] args) {
		int choice;
		do {
			Scanner src = new Scanner(System.in);
			System.out.println("Choose your choice: ");
			displayMenu();
			choice = Integer.parseInt(src.next());
			switch (choice) {
			case 1:
				createdatabase();
				break;
			case 2:
				dropDatabase();
				break;
			case 3:
				insertData();
				break;
			case 4:
				deleteData();
				break;
			case 5:
				UpdateData();
				break;
			case 6:
				GetbyId();
				break;
			case 7:
				Getall();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("invalid option");
				break;

			}

		} while (choice > 0);
	}

	private static void Getall() {
		try {
			Scanner src=new Scanner(System.in);
			Class.forName(Driver);
			System.out.println("Enter database name");
			String url="jdbc:mysql://localhost:3307/"+src.next();
			conn=DriverManager.getConnection(url, username, password);
			System.out.println("Enter table name");
			String sql="select * from "+src.next();
			pmst=conn.prepareStatement(sql);
			ResultSet rs=pmst.executeQuery();
			while(rs.next()) {
				System.out.println("order id: "+rs.getLong("order_id"));
				System.out.println("order name: "+rs.getString("order_name"));
				System.out.println("order pincode: "+rs.getLong("order_pincode"));
				System.out.println("order address: "+rs.getString("order_address"));
			}
			pmst.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	private static void GetbyId() {
		try {
			Scanner src=new Scanner(System.in);
			Class.forName(Driver);
			System.out.println("Enter da tabase name");
			String url="jdbc:mysql://localhost:3307/"+src.next();
			conn=DriverManager.getConnection(url, username, password);
			System.out.println("Enter table name");
			String sql="select * from "+src.next()+" where order_id=?";
			pmst=conn.prepareStatement(sql);
			System.out.println("enter id");
			pmst.setLong(1,src.nextLong());
			ResultSet rs=pmst.executeQuery();
			while(rs.next()) {
				System.out.println("order id: "+rs.getLong("order_id"));
				System.out.println("order name: "+rs.getString("order_name"));
				System.out.println("order pincode: "+rs.getLong("order_pincode"));
				System.out.println("order address: "+rs.getString("order_address"));
			}
			pmst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void UpdateData() {
		try {
		Scanner src=new Scanner(System.in);
		Class.forName(Driver);
		System.out.println("Enter Database name");
		String url="jdbc:mysql://localhost:3307/"+src.next();
		conn=DriverManager.getConnection(url, username, password);
		System.out.println("Enter table name");
		String sql="update "+src.next()+" set order_name=?,order_pincode=?,order_address=? where order_id=?";
		pmst=conn.prepareStatement(sql);
		System.out.println("Enter order name");
		pmst.setString(1,src.next());
		System.out.println("Enter order pincode");
		pmst.setLong(2, src.nextLong());
		System.out.println("Enter order address");
		pmst.setString(3, src.next());
		System.out.println("Enter order id");
		pmst.setLong(4, src.nextLong());
		int i=pmst.executeUpdate();
		if(i>0) {
			System.out.println("Database is updated");
		}
		else {
			System.out.println("Database is not updated");
		}
		conn.close();
		pmst.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static void deleteData() {
		try {
			Scanner src=new Scanner(System.in);
			Class.forName(Driver);
			System.out.println("Enter Database name");
			String url="jdbc:mysql://localhost:3307/"+src.next();
			conn=DriverManager.getConnection(url, username, password);
			System.out.println("Enter table name");
			String sql="delete from "+src.next()+" where order_id=?";
			pmst=conn.prepareStatement(sql);
			System.out.println("Enter order id");
			pmst.setLong(4, src.nextLong());
			int i=pmst.executeUpdate();
			if(i>0) {
				System.out.println("Data is deleted");
			}
			else {
				System.out.println("Data is not deleted");
			}
			conn.close();
			pmst.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static void insertData() {
		try {
			Scanner src=new Scanner(System.in);
			Class.forName(Driver);
			System.out.println("Enter Database name");
			String url="jdbc:mysql://localhost:3307/"+src.next();
			conn=DriverManager.getConnection(url, username, password);
			System.out.println("Enter table name");
			String sql="insert into "+src.next()+ "(order_id,order_name,order_pincode,order_address) values(?,?,?,?)";
			pmst=conn.prepareStatement(sql);
			System.out.println("Enter order id");
			pmst.setLong(1, src.nextLong());
			System.out.println("Enter order name");
			pmst.setString(2, src.next());
			System.out.println("Enter order pincode");
			pmst.setLong(3, src.nextLong());
			System.out.println("Enter order address");
			pmst.setString(4, src.next());
			int i=pmst.executeUpdate();
			if(i>0) {
				System.out.println("Data is updated");
			}
			else {
				System.out.println("Data is not updated");
			}
			conn.close();
			pmst.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void dropDatabase() {
		try {
			Class.forName(Driver);
			String url="jdbc:mysql://localhost:3307/";
			conn=DriverManager.getConnection(url, username, password);
			System.out.println("enter Database name");
			Scanner src=new Scanner(System.in);
			String sql="drop database "+src.next();
			pmst=conn.prepareStatement(sql);
			int i=pmst.executeUpdate();
			if(i==0) {
				System.out.println("Database is deleted");
			}
			else {
				System.out.println("Database is not deleted");
			}
			conn.close();
			pmst.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void createdatabase() {
		try {
			Class.forName(Driver);
			String url="jdbc:mysql://localhost:3307/";
			conn=DriverManager.getConnection(url, username, password);
			System.out.println("Enter Database name");
			Scanner src=new Scanner(System.in);
			String sql="create database "+src.next();
			pmst=conn.prepareStatement(sql);
			int i=pmst.executeUpdate();
			if(i>0) {
				System.out.println("Database is created");
			}
			else {
				System.out.println("Database is not created");
			}
			conn.close();
			pmst.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void displayMenu() {
		System.out.println("\t1.Create database ");
		System.out.println("\t2.Drop database ");
		System.out.println("\t3.Insert data ");
		System.out.println("\t4.Delete data by Id ");
		System.out.println("\t5.Update data ");
		System.out.println("\t6.Get by Email");
		System.out.println("\t7.Get all ");
		System.out.println("\t8.Exit ");
		System.out.print("Enter your choice:");
	}

}
