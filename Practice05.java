package Mar30th;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("#1 : The string length should be over 10");
		System.out.println("#2 : The string shouldn't contains the blank");
		System.out.println("#3 : The string should contains the capital letter"); // 65~90
		System.out.println("#4 : The string should contains the number"); // 48~57
		System.out.println("#5 : The string should contains the character 'a'");
		while (true) {
			System.out.print("->");
			String line = sc.nextLine();
			char[] chars = line.toCharArray();
			int count1 = 0, count2 = 0;
			for (int i = 0; i < line.length(); i++) {
				if (chars[i] >= 65 && chars[i] <= 90) {
					count1++;
				}
				if (chars[i] >= 48 && chars[i] <= 57) {
					count2++;
				}
			}
			if (line.length() <= 10) {
				System.out.println("The string length should be over 10");
				continue;
			}
			if (line.contains(" ") == true) {
				System.out.println("The string shouldn't contains the blank");
				continue;
			}
			if (count1 == 0) {
				System.out.println("The string should contains the capital letter");
				continue;
			}
			if (count2 == 0) {
				System.out.println("The string should contains the number");
				continue;
			}
			if (line.contains("a") == false) {
				System.out.println("The string should contains the character 'a'");
				continue;
			}
			System.out.println("PASS");
			break;
		}
	}

}
