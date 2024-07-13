
	import java.util.Scanner;

	public class ProductCalculator {

	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				int[] numbers = new int[5];

				// Prompt the user to enter five numbers
				System.out.println("Enter five numbers:");
				for (int i = 0; i < 5; i++) {
				    numbers[i] = scanner.nextInt();
				}

				// Calculate the product of the numbers using recursion
				int product = calculateProduct(numbers, 0);
				
				// Display the result
				System.out.println("The product of the five numbers is: " + product);
			}
	    }

	    // Recursive method to calculate the product of an array of numbers
	    public static int calculateProduct(int[] numbers, int index) {
	        // Base case: when index reaches the end of the array
	        if (index == numbers.length) {
	            return 1;
	        }
	        // Recursive case: multiply current number by the product of the rest
	        return numbers[index] * calculateProduct(numbers, index + 1);
	    }
	}


	
