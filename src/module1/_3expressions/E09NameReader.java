package module1._3expressions;

import java.util.Scanner;

public class E09NameReader {

	//Exercise 9: Run this program a few times, using different names
	//Notice how this code works regardless of what name it is given
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  

		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		System.out.println("Hello, " + name);

	}
}
