package Mar30th;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		while (true) {
			int choice = 0, money = 0;
			System.out.println("#Menu");
			System.out.println("1.Deposit");
			System.out.println("2.Withdrawal");
			System.out.println("Balance : " + balance);
			choice = sc.nextInt();
			money = sc.nextInt();
			switch (choice) {
			case 1:
				balance = balance + money;
				break;
			case 2:
				balance = balance - money;
				break;
			default:
				System.out.println("Error");
				break;
			}
		}

	}

}
