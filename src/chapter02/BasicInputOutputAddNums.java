package chapter02;

import java.util.Scanner;

public class BasicInputOutputAddNums {
	
	public static void main(String args[]) {
		//main for testing input and addition
		int num1;
		int num2;
		
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		num1 = userInput.nextInt();
		
		System.out.print("Please enter another number: ");
		num2 = userInput.nextInt();
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		
		userInput.close();
	}
	
}
