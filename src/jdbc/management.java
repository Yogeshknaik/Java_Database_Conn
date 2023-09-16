package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class management {

	private String Dname = "";
	private String Dpass = "";
	private String Durl = "";

	public void connectionToDatabase() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("enter your user name:");
			Dname = sc.nextLine();
			System.out.print("enter your password:");
			Dpass = sc.nextLine();
			System.out.print("enter your database url:");
			Durl = sc.nextLine();

			connectingdatabase conn = new connectingdatabase();
			conn.Coconnectingdatabase(Durl, Dname, Dpass);

		} catch (Exception e) {
			System.out.println("your entered details are wrong");

		}
	}
}
