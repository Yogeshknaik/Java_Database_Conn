package jdbc;

import java.util.Scanner;

public class Mainfile {

	public static void main(String[] args) {

		boolean flag = true;

		management mgmt = new management();
		createDatabase cDb = new createDatabase();

		while (flag) {
			System.out.println("enter your choice \n -> 1 for create databas. \n ->2 for show database ");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			switch (i) {
				case 1 -> {
					mgmt.connectionToDatabase();
					break;
				}
				case 2 -> {
					cDb.CrDatabase();
					cDb.ShowDatabase();
					break;

				}
				default -> {
					System.out.println("your choice is wrong ");
					flag = false;
				}
			}

		}

	}
}
