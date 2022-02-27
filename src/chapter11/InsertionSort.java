package chapter11;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myNumbers = {5,98,2,35,12,36,4,5,45,12};
		
		System.out.println("Here's my numbers before sorting...");
		
		for (int i : myNumbers) {
			System.out.print(i + ", ");
		}
		
		insertionSort(myNumbers);
		

		System.out.println("\nSorting...\n\nHere's my numbers AFTER sorting...");
		
		for (int i : myNumbers) {
			System.out.print(i + ", ");
		}

	}
	
	public static void insertionSort(int[] userArray) {
		int temp = 0;
		int i = 1;
		int j = 0;
		//for each loop, index 0 is considered sorted already
		for(i = 1; i < userArray.length; ++i) {
			//while index being checked is greater than zero and smaller than the previous one
			j = i;
			while (j > 0 && userArray[j] < userArray[j-1]) { //while two indexes are our of sort
					temp = userArray[j-1];
					userArray[j-1] = userArray[j];
					userArray[j] = temp;
					--j; //move the index for j back one index
			}
		}	
	}

}
