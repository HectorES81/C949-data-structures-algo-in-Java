package chapter05;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num_a;
		int num_b;
		
		System.out.print("Please enter first integer: ");
		num_a = Integer.parseInt(in.next());
		System.out.print("Please enter second integer: ");
		num_b = Integer.parseInt(in.next());
		
		while (num_a != num_b) {
			if( num_b > num_a) {
				num_b = num_b - num_a;
			} else {
				num_a = num_a - num_b;
			}
		}
		
		System.out.println(String.format("\nGCD is %d", num_a));
	}

}
