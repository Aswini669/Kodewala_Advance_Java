package com.kodewala.crudpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class MyntraCRUDApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kd", "root", "A9861@wini#");
			System.out.println("connection is established");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter 1 for inserttion, enter 2 for updating, enter 3 for deletion, 4 for selection");
			int choice = scan.nextInt();
			
			MyntraCRUD mnc = new MyntraCRUD();
			
			switch(choice) {
			case 1:
				mnc.insert(con);
				break;
			case 2:
				mnc.update(con);
				break;
			case 3:
				mnc.delete(con);
				break;
			case 4:
				mnc.select(con);
				break;
			default:
				System.out.println("invalid choice");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
