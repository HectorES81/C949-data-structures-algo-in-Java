package chapter08;

import java.util.Arrays;

public class Slicing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Practice slicing a list e.g. in python my_items{2:5]
		//creates a new list with index 2,3,4. The last parameter not inclusive
		
		String[] my_items = {"workout", "OMAD", "Walk at lunch", "Eat under 1,500 calories", "Study"};
		String[] sublist = Arrays.copyOfRange(my_items, 2, 5);
		System.out.println(my_items[1]);
		
		for (String l : sublist) {
			System.out.println(l);
		}
		
	}

}
