import java.util.Scanner;

public class BasicInputOutput {

	public static void main(String[] args) {
		//Testing basic input and output
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter age of dog (in years):");
		
		String dogAge = myObj.nextLine();
		System.out.println("The dog is " + dogAge + " years old.");
		
		myObj.close();
	}

}
