package chapter11;

public class ShellSort {
	static int swap = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myNumbers = {5,98,2,35,12,36,4,5,45,12, 1,2};
		
		System.out.println("Here's my numbers before sorting...");
		
		for (int i : myNumbers) {
			System.out.print(i + ", ");
		}
		int[] gapValues = {9, 5, 3, 1};
		shellSort(myNumbers, gapValues);
		

		System.out.println("\nSorting...\n\nHere's my numbers AFTER sorting...");
		
		for (int i : myNumbers) {
			System.out.print(i + ", ");
		}
	}
	
	public static void insertionSortInterleaved(int[] numbs, int numbsSize, int startIdx, int gap) {
		int i = 0;
		int j = 0;
		int temp = 0;
		for (i = startIdx + gap; i < numbsSize; i = i+ gap) {
			j = i;
			while (j - gap >= startIdx && numbs[j] < numbs[j - gap]) {
				temp = numbs[j];
				numbs[j] = numbs[j - gap];
				numbs[ j -gap] = temp;
				j = j - gap;
				
				System.out.println("\nAfter swap #" + swap + " ");
				for (int num : numbs) {
					System.out.print(num + ", ");
				}
				ShellSort.swap++;
			}
			
		}
	}
	
	public static void shellSort(int[] numbers, int[] gapValues) {
		for (int gapValue: gapValues) {
			for(int i = 0; i < gapValue; i++) {
				insertionSortInterleaved(numbers, numbers.length, i, gapValue);
			}
		}
	}

}
