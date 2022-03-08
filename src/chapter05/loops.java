package chapter05;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		String nose = "0";
		char user_value = '-';
		
		Scanner sc_in = new Scanner(System.in);
		
		while (user_value != 'q') {
			System.out.println(String.format(" %s %s ", user_value, user_value));
			System.out.println(String.format("  %s   ", nose));
			System.out.println(String.format(new String(new char[5]).replace("\0", Character.toString(user_value))));
			
			System.out.println("Enter a character to use ('q' to quit): ");
			user_value = sc_in.next().charAt(0);
		}
		System.out.println("Exiting...");
		sc_in.close();
	}
}
