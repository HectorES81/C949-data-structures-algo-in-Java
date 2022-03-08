package chapter05;

import java.util.Scanner;

public class RandMoodOrLottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "";
		Scanner scin = new Scanner(System.in);
		String[] validOptions = {"m", "l", "x"};
		//the sentence will say "I'm felling x today."
		String[] moods = {"brilliant", "sad", "happy", "lazy", "cold", "hungry"};
		//Sentence will say " Because 
		String[] moodCause = {"I rested well during the night", 
				              "my favorite team lost",
				              "I aced my last exam",
				              "the it's wet and dark outside",
				              "my furnace broke and it's 20f degress outside",
				              "I have not eaten in 8 hours"
							};
		
		System.out.print("Do you want to know my mood or a lottery number to play?\nEnter M or L: ");
		
		
		userInput = scin.nextLine().trim().toLowerCase();
				
		if(check(validOptions,userInput)) {
			System.out.println("you selected " + userInput);
			if(userInput.equals("m")) {
				System.out.println("my moood is ok.");
			}
			if(userInput.equals("l")) {
				System.out.println("6974");
			}
			if(userInput.equals("x")) {
				System.out.println("Thank you for playing. Exiting...");
				return;
			}
		}else {
			System.out.println(userInput + " is not a valid option. Goodbye.");
		}
	}
	
	private static boolean check(String[] arr, String toCheckValue) {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        
        for (String s : arr) {
            if (s.equals(toCheckValue)) {
            	/*System.out.println("s value: " + s);
            	System.out.println("toCheckValue value: " + toCheckValue);*/
                return true;
            }
        }
        return false;
    }
}
