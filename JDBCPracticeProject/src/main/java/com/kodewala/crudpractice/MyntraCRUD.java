package com.kodewala.crudpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MyntraCRUD {

	void insert(Connection con) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the srlNo: ");
			int srlno = scan.nextInt();
			scan.nextLine();
			System.out.println("enter the product name: ");
			String prodName = scan.nextLine();
			System.out.println("enter product price: ");
			int price = scan.nextInt();
			scan.nextLine();
			System.out.println("enter product status: ");
			String status = scan.nextLine();
			
			String query = "insert into myntra values(?,?,?,?)";	
			PreparedStatement pstmt1 = con.prepareStatement(query);
			
			//settings value
			pstmt1.setInt(1, srlno);
			pstmt1.setString(2, prodName);
			pstmt1.setInt(3, price);
			pstmt1.setString(4, status);
			
			//execute
			pstmt1.execute();
			System.out.println("inserttion is completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void update(Connection con) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the update value: ");
			String updateName = scan.nextLine();
			System.out.println("where u upadte: ");
			int srlNo = scan.nextInt();
			
			String query = "update set prodName=? where srlNo=?";
			PreparedStatement pstmt2 = con.prepareStatement(query);
			
			//settings value
			pstmt2.setString(1, updateName);
			pstmt2.setInt(2, srlNo);
			
			//execute
			pstmt2.execute();
			System.out.println("updating completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void delete(Connection con) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the delete id: ");
			int deleteSrl = scan.nextInt();
			
			String query = "delete from myntra where srlNo=?";
			PreparedStatement pstmt3 = con.prepareCall(query);
			
			//settings value
			pstmt3.setInt(1, deleteSrl);
			
			//execute
			pstmt3.execute();
			System.out.println("delete is completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void select(Connection con) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("select all");
			int srlNo = scan.nextInt();
			
			String query = "select * from myntra where srlNo=?";
			PreparedStatement pstmt4 = con.prepareStatement(query);
			
			//settings value
			pstmt4.setInt(1, srlNo);
			
			//execute
			pstmt4.execute();
			System.out.println("completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
