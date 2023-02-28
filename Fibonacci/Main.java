package Fibonacci;

/**
 * The Main class serves to execute Fibonacci sequence calculations.
 * Using this class will output .CSV file data for creating a graph of time results.
 * 
 * @author Zachary Krantz
 *
 */

public class Main {

	/**
	 * The main function... Its really pretty self-explanatory.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Iterative executions from 5 to 100
		long[] dataIterative = new long[20];
		for(int i = 5; i <= 100; i = i + 5) {
			long startTime = System.nanoTime();
			int num = fibIterative(i);
			dataIterative[(i/5)-1] = System.nanoTime() - startTime;
		}
		
		//Recursive executions from 5 to 100
		long[] dataRecursive = new long[20];
		for(int i = 5; i <= 100; i = i + 5) {
			long startTime = System.nanoTime();
			int[] nums = new int[i+1];
			int num = fibRecursive(i,nums);
			dataRecursive[(i/5)-1] = System.nanoTime() - startTime;
		}
		
		
		//Outputting the time and N values in .CSV format.
		System.out.print("NULL,");
		for(int i = 5; i <= 100; i = i +5) {
			System.out.print(i);
			//Whether to add a comma or line break
			if(i != 100) {
				System.out.print(",");
			} else {
				System.out.println(" ");
			}
		}
		
		System.out.print("Iterative:,");
		for(int i = 0; i <= 19; i++) {
			System.out.print(dataIterative[i]);
			//Whether to add a comma or line break
			if(i != 19) {
				System.out.print(",");
			} else {
				System.out.println();
			}
		}
		
		System.out.print("Recursive:,");
		for(int i = 0; i <= 19; i++) {
			System.out.print(dataRecursive[i]);
			//Whether to add a comma or line break
			if(i != 19) {
				System.out.print(",");
			} else {
				System.out.println();
			}
		}
	}
	
	
	/**
	 * Gets the nth number in the fibonacci sequence.
	 * 
	 * @param n  The amount of depth into the fibonacci sequence
	 * @return	The integer at the specified position
	 */
	public static int fibIterative(int n) {
		//If 0 or less than 0 return 0. Who wants a negative number? How would that even happen? Why would it even need to exist? Why do we exist? Why does this code exist? What would even happen if we tried to use a negative number? Would my computer explode? Maybe. I don't know.
		if(n <= 0) return 0;
		
		//Set the first and second number.
		int one = 0, two = 1;
		//From 1 to n
		for(int i = 1; i < n; i++) {
			//Save the temp value for two. Set two as the both of them combined, set one as the temp value.
			int temp = two;
			two = two + one;
			one = temp;
		}
		
		//Return two, the sum of the previous numbers in the sequence.
		return two;
	}
	
	
	/**
	 * Gets the nth number in the fibonacci sequence.
	 * 
	 * @param n  The amount of depth into the fibonacci sequence
	 * @param fibNums  The fibonacci numbers in order
	 * @return  The integer at the specified position
	 */
	public static int fibRecursive(int n, int[] fibNums) {
		//If the value at the position isn't NULL, return the value.
		if(fibNums[n] != 0) return fibNums[n];
		//If n is 1 or 2 return 1, it shouldn't recurse anymore.
		if(n == 1 || n == 2) return 1;
		//Recurse and set the value at index n.
		fibNums[n] = fibRecursive(n-1, fibNums) + fibRecursive(n-2, fibNums);
		//Return number at index n.
		return fibNums[n];
	}

}
