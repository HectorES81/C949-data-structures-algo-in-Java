package chapter11;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myNumbers = {5,98,2,35,12,36,4,5,45,12};
		
		System.out.println("Here's my numbers before sorting...");
		
		for (int i : myNumbers) {
			System.out.print(i + ", ");
		}
		
		int[] sortedArray = selectionSort(myNumbers);
		

		System.out.println("\nSorting...\n\nHere's my numbers AFTER sorting...");
		
		for (int i : myNumbers) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\nHere's the new array that is returned from sorting fucntion...");
		
		for (int i : sortedArray) {
			System.out.print(i + ", ");
		}

	}
	
	public static int[] selectionSort(int[] userArray) {
		int i = 0;
		int j = 0;
		int idxSmallest = 0;
		int temp = 0;
		//make a copy so that unsorted copy still exist
		int[] intArray = userArray.clone();
		
		int numbersSize = intArray.length;
		
		for(i = 0; i < numbersSize; ++i) {
			//find index of smallest remaining element
			for(j = i + 1; j < numbersSize; ++j) {
				if(intArray[j] < intArray[idxSmallest]) {
					idxSmallest = j;
				}
			}
			//this swap occurs after checking for the next smallest int
			//out of remaining elements (j = i+1) to start inner loop
			temp = intArray[i];
			intArray[i] = intArray[idxSmallest];
			intArray[idxSmallest] = temp;
		}
		return intArray;	
	}

}
