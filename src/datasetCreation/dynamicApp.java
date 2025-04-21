package datasetCreation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class dynamicApp {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String username = "root";
	private static final String password = "root";
	private static Connection conn;
	private static PreparedStatement pmst;

	public static void main(String[] args) {
		int choice;
		do {
			Scanner src = new Scanner(System.in);
			System.out.println("choose your choice");
			DisplayMenu();
			choice = Integer.parseInt(src.next());
			switch (choice) {
			case 1:
				CreateDatabase();
				break;
			case 2:
				DropDatabase();
				break;
			case 3:
				DataInsertion();
				break;
			case 4:
				DeleteById();
				break;
			case 5:
				UpdateData();
				break;
			case 6:
				GetById();
				break;
			case 7:
				GetAll();
				break;
			case 8:
				login();
				break;
			case 9:
				System.exit(0);
				break;
			}
		} while (choice > 0);
	}

	private static void DeleteById() {
		// TODO Auto-generated method stub

	}

	private static void login() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			System.out.println("Enter database name: ");
			String url = "jdbc:mysql://localhost:3307/" + src.next();
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Enter table name: ");
			String sql = "select * from " + src.next() + "where order_id=? and order_name=?";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter order_id");
			pmst.setLong(1, src.nextLong());
			System.out.println("Enter order_name");
			pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
//			while (rs.next()) {
//				System.out.println("order_id is:" + rs.getLong("order_id"));
//				System.out.println("order_name is:" + rs.getString("order_name"));
//				System.out.println("order_address is:" + rs.getString("order_address"));
//				System.out.println("order+pincode is:" + rs.getInt("order_pincode"));
//
//			}
			if(rs.next()) {
				System.out.println("Login success");
			}
			else {
				System.out.println("login failure");
			}
			pmst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void GetAll() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			System.out.println("Enter database name ");
			String url = "jdbc:mysql://localhost:3307/" + src.next();
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Enter table name: ");
			String sql = "select * from" + src.next();
			pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				System.out.println("order_id is:" + rs.getLong("order_id"));
				System.out.println("order_name is:" + rs.getString("order_name"));
				System.out.println("order_address is:" + rs.getString("order_address"));
				System.out.println("order+pincode is:" + rs.getInt("order_pincode"));

			}
			pmst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void GetById() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			System.out.println("Enter database name: ");
			String url = "jdbc:mysql://localhost:3307/" + src.next();
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Enter table name: ");
			String sql = "select * from " + src.next() + "where order_id=?";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter order_id");
			pmst.setLong(1, src.nextLong());
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				System.out.println("order_id is:" + rs.getLong("order_id"));
				System.out.println("order_name is:" + rs.getString("order_name"));
				System.out.println("order_address is:" + rs.getString("order_address"));
				System.out.println("order+pincode is:" + rs.getInt("order_pincode"));

			}
			pmst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void UpdateData() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			System.out.println("Enter Database name to Update data");
			String url = "jdbc:mysql://localhost:3307/" + src.next();
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Enter Database table name");
			String sql = "update  " + src.next() + "set order_name=?,order_pincode=?,order_address=? where order_id=?";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter order name");
			pmst.setString(1, src.next());
			System.out.println("Enter order pincode");
			pmst.setInt(2, src.nextInt());
			System.out.println("Enter order address");
			pmst.setString(3, src.next());
			System.out.println("Enter order id");
			pmst.setLong(4, src.nextLong());
			int i = pmst.executeUpdate();
			if (i > 0) {
				System.out.println("Database updates Successfully");
			} else {
				System.out.println("Database Not updated...!");
			}
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void DeleteByEmail() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			System.out.println("Enter Database name to insert data");
			String url = "jdbc:mysql://localhost:3307/" + src.next();
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Enter Database table name");
			String sql = "delete from " + src.next() + " where order_id=? ";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter order id");
			pmst.setLong(1, src.nextLong());
			int i = pmst.executeUpdate();
			if (i > 0) {
				System.out.println("Database deleted Successfully");
			} else {
				System.out.println("Database Not deleted...!");
			}
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void DataInsertion() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			System.out.println("Enter Database name to insert data");
			String url = "jdbc:mysql://localhost:3307/" + src.next();
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Enter Database table name");
			String sql = "insert into " + src.next()
					+ "(order_id,order_name,order_pincode,order_address) values(?,?,?,?)";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter order id");
			pmst.setLong(1, src.nextLong());
			System.out.println("Enter order name");
			pmst.setString(2, src.next());
			System.out.println("Enter order pincode");
			pmst.setInt(3, src.nextInt());
			System.out.println("Enter order Address");
			pmst.setString(4, src.next());
			int i = pmst.executeUpdate();
			if (i > 0) {
				System.out.println("Database inserted Successfully");
			} else {
				System.out.println("Database Not inserted...!");
			}
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void DropDatabase() {
		try {
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3307/";
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Enter Database name");
			Scanner src = new Scanner(System.in);
			String sql = "drop database " + src.next();
			pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if (i == 0) {
				System.out.println("Database Dropped Successfully");
			} else {
				System.out.println("OOPS Database Not Dropped...!");
			}
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void CreateDatabase() {
		try {
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3307/";
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Enter Database name");
			Scanner src = new Scanner(System.in);
			String sql = "create database " + src.next();
			pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if (i > 0) {
				System.out.println("Database Created Successfully");
			} else {
				System.out.println("Database Not created...!");
			}
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void DisplayMenu() {
		System.out.println("\t1.create database");
		System.out.println("\t2.drop database");
		System.out.println("\t3.data insertion");
		System.out.println("\t4.delete by email");
		System.out.println("\t5.update data");
		System.out.println("\t6.get by Id");
		System.out.println("\t7.get all");
		System.out.println("\t8.login");
		System.out.println("\t9.exit");
	}

}
