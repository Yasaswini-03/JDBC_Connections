package datasetCreation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Updation {
	private static final String driver="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3307/sampledb1";
	private static final String username="root";
	private static final String pwd="root";
	private static Connection conn;
	private static PreparedStatement pmst;
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName(driver);
			conn=DriverManager.getConnection(url, username, pwd);
			String sql="Update table1 set Lemail=? where Lid=?";
			pmst=conn.prepareStatement(sql);
			System.out.println("Enter email");
			pmst.setString(1, sc.nextLine());
			System.out.println("Enter id where it has to change");
			pmst.setString(2, sc.nextLine());
			int i=pmst.executeUpdate();
			if (i>0) {
				System.out.println("Data is updated");
			}
			else {
				System.out.println("Data is Not updated");
			}
			conn.close();
			pmst.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
