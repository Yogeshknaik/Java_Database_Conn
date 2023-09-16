package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class createDatabase {
	// creating database
	public void CrDatabase() {

		try {
			Connection c = connectingdatabase.con;
			Statement stm = c.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the database name you want to create");
			String name = sc.nextLine();
			String s = "create database " + name;
			boolean b1 = stm.execute(s);
			System.out.println("Database created:" + !b1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error while creating database");
		}
	}

	// showing database
	public void ShowDatabase() {

		try {
			Connection c = connectingdatabase.con;
			Statement stm = c.createStatement();
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			String s = "show databases";
			boolean b1 = stm.execute(s);
			System.out.println("database is created:" + b1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error while showing  database");
		}

	}
}
