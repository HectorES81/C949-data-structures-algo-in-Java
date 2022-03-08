package chapter03;

public class FindMax {

	public static void main(String[] args) {
		//this program will find the the max value in an array of ints
		int[] myArray = new int[] {32,52,14,-21,84,32};
		int secondArray[] = new int[3]; //this is not preferred [] after var name
		secondArray[0] = 25;
		secondArray[1] = -25;
		secondArray[2] = 35;
		
		System.out.println(findMaxInArray(myArray));
		System.out.println(findMaxInArray(secondArray));
	}
	
	public static int findMaxInArray(int[] myArray) {
		int max = 0;
		for(int i = 0; i < myArray.length; i++ ) {
			if(i == 0) {
				max = myArray[i];
			} else {
				if (myArray[i] > max) {
					max = myArray[i];
				}
			}
		}
		return max;
	}

}
