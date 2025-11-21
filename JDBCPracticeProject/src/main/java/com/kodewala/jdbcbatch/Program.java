package com.kodewala.jdbcbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kd", "root", "A9861@wini#");
			
			//query
			String query = "insert into myntra (srlNo, prodName, price, status) values(?,?,?,?)";
			
			connection.setAutoCommit(false);
			
			PreparedStatement pstmt = connection.prepareStatement(query);
			
			System.out.println("before executing query.");
			for(int i=0; i<14; i++) 
			{
				pstmt.setInt(1, 1006 + i);
				pstmt.setString(2, "grocery" + i);
				pstmt.setInt(3, 99);
				pstmt.setString(4, "Delivered");
				pstmt.addBatch();
			}
			System.out.println("After executing query..");
			int[] result = pstmt.executeBatch();
			System.out.println("batch is updated");
			connection.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
