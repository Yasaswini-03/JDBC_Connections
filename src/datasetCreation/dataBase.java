package datasetCreation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class dataBase {
	private static final String driver="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3307/";
	private static final String username="root";
	private static final String pwd="root";
	private static PreparedStatement pmst;
	private static Connection conn;
public static void main(String[] args){
	try {
		Scanner src=new Scanner(System.in);
		Class.forName(driver);	
		conn=DriverManager.getConnection(url,username,pwd);
		System.out.println("Enter database name: ");
		String sql="create database "+src.next();
		pmst=conn.prepareStatement(sql);
		int i = pmst.executeUpdate();
		if(i>0) {
			System.out.println("Database is created");
		}else {
			System.out.println("Database is not created");
		}
		pmst.close();
		conn.close();
		src.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("error");
	}
}
}
