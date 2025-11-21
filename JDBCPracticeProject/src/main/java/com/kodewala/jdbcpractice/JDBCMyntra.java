package com.kodewala.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCMyntra {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("the driver is loaded successfully");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kd","root","A9861@wini#");
			System.out.println("connection is established");
			
			//String createQuery = "create table myntra (srlNo int,prodName varchar(30),price int,status varchar(30))";
			//String insertQuery = "insert into myntra values(1004,'basket',299,'on the way')";
			//String updateQuery = "update myntra set prodName='face wash' where srlNo=1004";
			String deleteQuery = "delete from myntra where srlNo=1003";
			//create statement
			Statement statment = con.createStatement();
			statment.execute(deleteQuery);
			System.out.println("query is executed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
