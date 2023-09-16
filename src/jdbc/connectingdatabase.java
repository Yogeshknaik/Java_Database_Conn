package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectingdatabase {

	static Connection con = null;

	// connection process
	public Connection Coconnectingdatabase(String a, String b, String c) {
		try {
			con = DriverManager.getConnection(a, b, c);
			System.out.print("connected sucessfully");
		} catch (Exception e) {

			System.out.println("error while connecting");
		}
		return con;
	}

}
