package Mar30th;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1 / num2, sum = 0;
		for (int i = 1; i <= num3; i++) {
			sum = sum + i * num2;
		}
		System.out.print("SUM : " + sum + " (");
		for (int i = 1; i < num3; i++) {
			System.out.print(i * num2 + ", ");
		}
		System.out.println(num3 * num2 + ")");
	}

}
