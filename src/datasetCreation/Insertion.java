package datasetCreation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insertion {
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
			String sql="insert into table1(Lid,Lemail,Lpassword) values(?,?,?)";
			pmst=conn.prepareStatement(sql);
			System.out.println("Enter login id");
			pmst.setString(1, sc.nextLine());
			System.out.println("Enter login email");
			pmst.setString(2, sc.nextLine());
			System.out.println("Enter login password");
			pmst.setString(3, sc.nextLine());
			int i=pmst.executeUpdate();
			if (i>0) {
				System.out.println("Data inserted");
			}
			else {
				System.out.println("Data Not inserted");
			}
			conn.close();
			pmst.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

