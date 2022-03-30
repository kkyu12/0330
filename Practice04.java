package Mar30th;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("#Menu");
		System.out.println("1. Encryption");
		System.out.println("2. Decryption");
		System.out.println("select type");
		int choice = sc.nextInt();
		System.out.println("input word");
		String line = sc.next();
		char[] chars = line.toCharArray();
		if (choice == 1) {
			for (int i = 0; i <line.length(); i++) {
				if (chars[i] > 120) {
					chars[i] = (char) (chars[i] - 24);
				} else {
					chars[i] = (char) (chars[i] + 2);
				}
			}
		} else if (choice == 2) {
			for (int i = 0; i <line.length(); i++) {
				if (chars[i] < 99) {
					chars[i] = (char) (chars[i] + 24);
				} else {
					chars[i] = (char) (chars[i] - 2);
				}
			}
		} else {
			System.out.println("Error");
		}
		for (int i = 0; i < line.length(); i++) {
			System.out.print(chars[i]);
		}

	}

}
