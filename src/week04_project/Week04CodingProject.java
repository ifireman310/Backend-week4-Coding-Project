package week04_project;

public class Week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using this string to separate lines
		String linesep = "----------------------------";
		System.out.println(linesep);
		System.out.println("Problem 1 Setup) ");
		
		/* Problem 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 * 			a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		 * 				(i.e. do not use ages[7] in your code). Print the result to the console.  
		 * 			b. Create a new array of int called ages2 with 9 elements 
		 * 				(ages2 will be longer than the ages array, and have more elements).  
		 * 				i. Make sure that there are 9 elements of type int in this new array.  
		 * 				ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		 * 				iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		 * 			c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */ 		
		
		// Initialize the ages integer array (length 8)
		int[] ages = {3,9,23,64,2,8,28,93};
		
		// Print out the integer array to console
		System.out.println();
		System.out.println("ages int array:");
		printIntArrayContents(ages);
		
		// Solve problem 1a, by subtracting the first element of ages from the last element. The index of the last element is equal to the array length minus one. The first element is the 0th index.
		System.out.println("\n");
		System.out.print("Problem 1.a result: ");
		System.out.println(ages[ages.length-1]-ages[0]);
		
		// Now, set up problem 1b by creating ages2, a new 9 element integer array
		int[] ages2 = new int[9];
		
		// populate the ages2 array arbitrarily (I'm doing multiples of 5)
		for (int i = 0; i < ages2.length; i++ ) {
			ages2[i] = i*5;
		}
		
		// Print the contents of ages2 to the console
		System.out.println();
		System.out.println("Problem 1.b setup) ages2 integer array: ");
		printIntArrayContents(ages2);
		
		// Problem 1.b.i - Print the length of ages2 to the console
		System.out.println("\n");
		System.out.print("Problem 1.b.i result (ages2 array length): ");
		System.out.println(ages2.length);
		
		// Problem 1.b.ii - Subtract the last element of ages2 from the first element of ages2.
		System.out.print("Problem 1.b.ii result (subtraction of ages2 1st & last array elements): ");
		System.out.println(ages2[ages2.length-1]-ages2[0]);
		
		// For Problem 1.b.iii, I'm subtracting the last element of ages2 from ages. These are arrays of different length, but I'm using the same process to obtain the last element in each array.
		System.out.print("Problem 1.b.iii result (subtracting last elements of ages2 from ages1, two differently sized arrays): ");
		System.out.println(ages[ages.length-1] - ages2[ages2.length-1]);
		System.out.println();
		
		System.out.println("Problem 1.c:");
		
		// Compute the average age from the first array
		double average_age = 0;
		
		// Sum up all ages in the array, then divide by the length of the array (representing number of people) to get the average age
		for (int age : ages) {
			average_age += age;
		}
		average_age = average_age/ages.length;
		System.out.println("Average age: " + average_age + " years old.");
		System.out.println(linesep);
		System.out.println("");
		
		
		
		/* Problem 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 * 		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		 * 		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 * 
		 */
		
		System.out.println(linesep);
		System.out.println("Problem 2 Setup) ");
		System.out.println("Array of strings: ");
		// Instantiate string
		String[] names = {"Sam","Tommy","Tim","Sally", "Buck", "Bob"};
		printStringArrayContents(names);
		System.out.println();
		
		// For problem 2a, to calculate the average number of letters per name, sum up the total number of letters and divide by the number of names.
		double total_letters = 0;
		
		for (String name : names) {
			total_letters += name.length();
		}
		
		// Compute average number of letters per name, then print to console
		double average_letters = total_letters/names.length;
		System.out.println("Problem 2a result (average letters per name): " + average_letters);
		
		// Now solve problem 2b, concatenate all the strings in the array together, separate by spaces, and print to the console
		String concatString = "";
		
		// In an enhanced for loop, add each string in the Array to concatString along with a space, so that subsequent additions are spaced apart.
		for (String str : names) {
			concatString += str + " ";
		}
		
		// Print result of problem 2b to console
		System.out.println("Problem 2b result (concatenated string): " + concatString);
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 3. How do you access the last element of any array?
		 * 
		 *  Answer: Generally, do array[array.length-1]
		 * 
		 */
		System.out.println(linesep);
		System.out.println("Problem 3) ");
		System.out.println("To access the last element of any array, do array[array.length-1]");
		//Example
		System.out.println("Example from problem 2, names: " + names[names.length-1]);
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 4. How do you access the last element of any array?
		 * 
		 *  Answer: Generally, do array[0]
		 * 
		 */
		System.out.println(linesep);
		System.out.println("Problem 4) ");
		System.out.println("To access the first element of any array, do array[0]");
		//Example
		System.out.println("Example from problem 2, names: " + names[0]);
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 5. Create a new array of int called nameLengths. 
		 * Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array. 
		 * 
		 */
		System.out.println(linesep);
		System.out.println("Problem 5) ");
		
		// Create integer array of the same size as names
		int[] nameLengths = new int[names.length];
		
		// Loop over each name, and store the length of that name in the corresponding element of nameLengths
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		// Print the namesLength array to the console
		System.out.println("namesLength array:");
		printIntArrayContents(nameLengths);
		System.out.println();
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console. 
		 * 
		 */
		System.out.println(linesep);
		System.out.println("Problem 6) ");
		
		int sum = 0;
		// Loop over each element of the array using an enhanced for loop, and add each element to "sum", then print to console
		for (int num : nameLengths) {
			sum += num;
		}
		System.out.println("Sum of elements in namesLength array: " + sum);
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		 * (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 * 
		 */
		System.out.println(linesep);
		System.out.println("Problem 7) ");
		String word = "Hello";
		int n = 3;
		System.out.println("Word: " + word);
		System.out.println("n: " + n);
		System.out.println("Result: " + repeatPhraseNTimes(word,n));
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
		 * (the full name should be the first and the last name as a String separated by a space).
		 * 
		 */
		System.out.println(linesep);
		System.out.println("Problem 8) ");
		String firstName = "Ian";
		String lastName = "Fireman";
		String fullName = returnFullName(firstName,lastName);
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Full name: " + fullName);
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 9.  Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		 * 
		 * 
		 */
		System.out.println(linesep);
		System.out.println("Problem 9) ");
		// Build two test arrays, one that should return true, and one that should return false
		int[] problem9intArray1 = {1,2,3};
		int[] problem9intArray2 = {100,200,300};
		
		System.out.println("First int array to test: "); 
		printIntArrayContents(problem9intArray1);
		System.out.println();
		System.out.println("Result (sum > 100?): " + isSumOfIntArrayGreaterThan100(problem9intArray1));
		System.out.println();
		System.out.println("Second int array to test: "); 
		printIntArrayContents(problem9intArray2);
		System.out.println();
		System.out.println("Result (sum > 100?): " + isSumOfIntArrayGreaterThan100(problem9intArray2));
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		 * 
		 * 
		 */
		System.out.println(linesep);
		System.out.println("Problem 10) ");
		double[] doubleArray1 = {1.1,2.2,3.3};
		
		System.out.println("Double array for testing: ");
		printDoubleArrayContents(doubleArray1);
	
		System.out.println();
		System.out.println("Average: " + averageDoubleArray(doubleArray1));
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		 * 
		 * 
		 */
		
		System.out.println(linesep);
		System.out.println("Problem 11) ");
		
		// Make another arbitrary double array
		double[] doubleArray2 = {10.5, 30.1, 42, 55};
		
		System.out.println("First double array: ");
		printDoubleArrayContents(doubleArray1);
		System.out.println();
		System.out.println("Second double array: ");
		printDoubleArrayContents(doubleArray2);
		System.out.println();
		System.out.println("Average of elements in first array is greater than second?: ");
		
		// Call the method
		System.out.println(isAverageOfFirstArrayElementsLarger(doubleArray1,doubleArray2));
		System.out.println(linesep);
		System.out.println("");
		
		
		/* Problem 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 * 
		 * 
		 */
		System.out.println(linesep);
		System.out.println("Problem 12) ");
		boolean isHotOutside = true;
		double moneyInPocket = 10.7;
		
		System.out.println("isHotOutside: " + isHotOutside);
		System.out.println("moneyInPocket: " + moneyInPocket);
		System.out.println("willBuyDrink: " + willBuyDrink(isHotOutside,moneyInPocket));
		System.out.println(linesep);
		System.out.println("");
		
		/* Problem 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 * 
		 * My method normalizes an array of doubles of arbitrary length. Normalization of arrays is useful in many aerospace engineering applications
		 * to split a vector into it's magnitude and direction.
		 */
		System.out.println(linesep);
		System.out.println("Problem 13) ");
		System.out.println("Double array to normalize: ");
		printDoubleArrayContents(doubleArray1);
		System.out.println();
		
		double[] normalizedArray = normalizeArray(doubleArray1);
		
		System.out.println();
		System.out.println("Normalized Array:");
		printDoubleArrayContents(normalizedArray);
		System.out.println();
		System.out.println(linesep);
	}
	
	
	// Problem 13 Method
	public static double[] normalizeArray(double[] arr) {
		// This method takes in an array of doubles, and returns a normalized version of the array
		// A normalized array has the following property: sqrt((sum of elements)^2) = 1 
		// The main method of normalizing an array is computing the sum of the square of each individual element, 
		// square rooting that sum, and then dividing each element of the array by that value (called the root sum of squares).
		
		// Create a new array the same length as the input array
		double[] normalizedArray = new double[arr.length];
		
		// First get the sum of squares of all elements in the array
		double sum_of_squares = 0;
		
		// Obtain the sum of squares by summing up each element of the array multiplied by itself
		for (double num : arr) {
			sum_of_squares += num*num;
		}
		
		// Square root the sum of squares to get the "magnitude" of the array
		double root_sum_of_squares = Math.sqrt(sum_of_squares);
		
		// To return the normalized array, divide each element by the root sum of squares
		for (int i = 0; i < arr.length; i++) {
			normalizedArray[i] = arr[i]/root_sum_of_squares;
		}
		
		// return normalized array 
		return normalizedArray;
		
	}
	
	// Problem 12 Method
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		// Return true if isHotOutside == true and moneyInPocket > 10.5, false otherwise
		if (isHotOutside && moneyInPocket > 10.5) {
			return true;
		} else {
			return false;
		}
	}
	
	// Problem 11 Method
	public static boolean isAverageOfFirstArrayElementsLarger(double[] arr1, double[] arr2) {
		
		// Utilize the existing method from problem 10 to compute the average of each array, compare the two average1 > average2, and return the boolean result.
		return averageDoubleArray(arr1) > averageDoubleArray(arr2);
		
	}
	
	// Problem 10 Method
	public static double averageDoubleArray(double[] doubleArr) {
		
		// Initialize average to zero
		double average = 0;
		
		// Sum up all values in the array of doubles using an enhanced for loop
		for (double num : doubleArr) {
			average += num;
		}
		
		// Divide the sum by the number of elements to get the average
		average = average/doubleArr.length;
		
		// return the average
		return average;
	}
	
	// Problem 9 Method
	public static boolean isSumOfIntArrayGreaterThan100(int[] intArray) {
		
		// Initialize sum to zero
		int sum = 0;
		
		// Sum up all integers using enhanced for loop over integer array
		for (int num : intArray) {
			sum += num;
		}
		
		// Will return true if sum > 100, false otherwise
		return sum > 100;
	}
	
	// Problem 8 Method
	public static String returnFullName(String firstName, String lastName) {
		
		// Concatenate string with space in between
		String fullName = firstName + " " + lastName;
		
		return fullName;
	}
	
	
	// Problem 7 Method
	public static String repeatPhraseNTimes(String word, int n) {
		
		String output_string = "";
		// Loop n times, and on each iteration add "word" to the output string to concatenate it n times total
		for (int i = 0; i < n; i++) {
			output_string += word;
		}
		return output_string;
	}
	
	// I've made this method to make my code above more readable, and since I was copy/pasting similar code more than once
	public static void printStringArrayContents(String[] stringArray) {
		for (String str : stringArray) {
			System.out.print(str + " ");
		}
	}
	
	// I've made this method to make my code above more readable, and since I was copy/pasting similar code more than once
	public static void printIntArrayContents(int[] intArray) {
		for (int num : intArray) {
			System.out.print(num + " ");
		}
	}
	
	// I've made this method to make my code above more readable, and since I was copy/pasting similar code more than once
	public static void printDoubleArrayContents(double[] doubleArray) {
		for (double num : doubleArray) {
			System.out.print(num + " ");
		}
	}
	
}
