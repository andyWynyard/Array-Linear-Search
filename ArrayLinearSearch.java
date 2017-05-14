import java.util.Scanner;

/*
*	Study Drill:
*	1. Declaring the int num before the for loops
*	did not work. 
*	2. The study drill was hard, and it took some research
* 	to figure out. I think there are actually many
*	ways to actually do this, but I'm not
*	good enough yet.
*/

public class ArrayLinearSearch {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = {12345, 54321, 101010,
			8675309, 31415, 271828};
		//int num;
		int toFind;
		boolean found = false;
		System.out.print("There are " + orderNumbers.length);
		System.out.println(" orders in the database.");

		System.out.print("Orders: ");
		for (int num: orderNumbers) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();

		for (int num: orderNumbers) {
			if (num == toFind) {
				System.out.println(num + " found");
				found = true;
			} 
		} 
		if (found == false) {
			System.out.println("Sorry " + toFind + " doesn't exist.");
		}
	}	
}
