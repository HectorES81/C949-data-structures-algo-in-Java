package chapter11;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   int numbers[] = { 10, 2, 78, 4, 45, 32, 7, 11, 1, 3, 56, 487, 36};
	   final int NUMBERS_SIZE = numbers.length;
	   int i = 0;
	   
	   System.out.print("UNSORTED: ");
	   for(i = 0; i < NUMBERS_SIZE; ++i) {
	      System.out.print(numbers[i] + " ");
	   }
	   System.out.println();
	   
	   // Initial call to quicksort
	   QuickSort.quicksort(numbers, 0, NUMBERS_SIZE - 1);
	   
	   System.out.print("SORTED: ");
	   for(i = 0; i < NUMBERS_SIZE; ++i) {
	      System.out.print(numbers[i] + " ");
	   }
	   System.out.println();
	
	}
	
	public static int partition(int[] numbers, int lowIndex, int highIndex) {
	   // Pick middle element as pivot
	   int midpoint = lowIndex + (highIndex - lowIndex) / 2;
	   int pivot = numbers[midpoint];
	   
	   boolean done = false;
	   while (!done) {
	      // Increment lowIndex while numbers[lowIndex] < pivot
	      while (numbers[lowIndex] < pivot) {
	         lowIndex += 1;
	      }
	      
	      // Decrement highIndex while pivot < numbers[highIndex]
	      while (pivot < numbers[highIndex]) {
	         highIndex -= 1;
	      }
	      
	      // If zero or one elements remain, then all numbers are 
	      // partitioned. Return highIndex.
	      if (lowIndex >= highIndex) {
	         done = true;
	      }
	      else {
	         // Swap numbers[lowIndex] and numbers[highIndex]
	         int temp = numbers[lowIndex];
	         numbers[lowIndex] = numbers[highIndex];
	         numbers[highIndex] = temp;
	         
	         // Update lowIndex and highIndex
	         lowIndex += 1;
	         highIndex -= 1;
	      }
	   }
		   
		   return highIndex;
		}

	public static void quicksort(int[] numbers, int lowIndex, int highIndex) {
	   // Base case: If the partition size is 1 or zero 
	   // elements, then the partition is already sorted
	   if (lowIndex >= highIndex) {
	      return;
	   }
	   
	   // Partition the data within the array. Value lowEndIndex 
	   // returned from partitioning is the index of the low 
	   // partition's last element.
	   int lowEndIndex = QuickSort.partition(numbers, lowIndex, highIndex);
	   
	   // Recursively sort low partition (lowIndex to lowEndIndex) 
	   // and high partition (lowEndIndex + 1 to highIndex)
	   quicksort(numbers, lowIndex, lowEndIndex);
	   quicksort(numbers, lowEndIndex + 1, highIndex);
	}


}
