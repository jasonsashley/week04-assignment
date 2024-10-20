package project;

public class Main {

	public static void main(String[] args) {

		// 1.a
		// Creating an array, then passing it to methods to subtract the first element
		// from the last & print it out.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		System.out.println("1.a:::");
		System.out.println("Values in ages: ");
		printArray(ages);

		System.out.println("New values in ages: ");
		subtractFirstFromLast(ages);
		printArray(ages);

		// 1.b
		// Creating an array of a different size.
		int[] ages2 = new int[9];
		for (int i = 1; i <= ages2.length; i++) {
			ages2[i - 1] = i;
		}
		System.out.println("\n1.b:::");
		System.out.println("Values in ages2: ");
		printArray(ages2);

		// Passing it to those same methods. Nothing needs to be changed for it to work
		// with the different size.
		System.out.println("New values in ages2: ");
		subtractFirstFromLast(ages2);
		printArray(ages2);

		int[] test = { 10, 2 };
		subtractFirstFromLast(test);
		printArray(test);

		// 1.c
		// Calculating the average of values in ages2
		int sum = 0;
		for (int num : ages2) {
			sum += num;
		}

		System.out.println("\n1.c:::");
		System.out.println("Average of values in ages2 (rounded down): " + sum / ages2.length);

		// 2.a
		// Creating a String array and printing out the average number of letters
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		sum = 0;
		for (String name : names) {
			sum += name.length();
		}
		System.out.println("\n2.a:::");
		System.out.print("Values in names: ");
		printArray(names);
		System.out.println("Average of letters in names (rounded down): " + sum / names.length);

		// 2.b
		// Looping through the names array to create a new String with all the elements
		// separated by a space & then printing it out
		String concat = "";
		for (String name : names) {
			concat += name + " ";
		}
		System.out.println("\n2.b:::");
		System.out.println(concat);

		// 3
		// You can access the last element in an array by calling the index [length - 1]
		System.out.println("\n3:::");
		System.out.println("Last element of names array: " + names[names.length - 1]);

		// 4
		// You can access the first element in an array by calling the index [0]
		System.out.println("\n4:::");
		System.out.println("First element of names array: " + names[0]);

		// 5
		// Creating a new int array that's the length of each of the elements in the
		// names array
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println("\n5:::");
		System.out.print("Values in nameLengths: ");
		printArray(nameLengths);

		// 6
		// Calculating the sum of values in nameLengths array
		sum = 0;
		for (int num : nameLengths) {
			sum += num;
		}
		System.out.println("\n6:::");
		System.out.println("Sum of elements in nameLengths: " + sum);

		// 7
		// Passing a String & int and getting the word concatenated to itself int number
		// of times.
		String arg = "Boo";
		int num = 5;
		System.out.println("\n7:::");
		System.out.print(arg + " printed " + num + " amount of times: ");
		System.out.println(repeatString(arg, num));

		// 8
		// Passing two Strings to a method to get them separated by a space
		String firstName = "John";
		String lastName = "Doe";
		System.out.println("\n8:::");
		System.out.println(firstName + " and " + lastName + " in one string: " + createFullName(firstName, lastName));

		// 9
		// Creating an int array and passing it to a method that checks if the sum is
		// greater than 100
		int[] nums = { 98, 0, 1, 2 };
		System.out.println("\n9:::");
		System.out.print("nums array: ");
		printArray(nums);
		System.out.println("Is the sum greater than 100? " + isSumGreaterThan100(nums));

		// 10
		// Creating an array of doubles and passing it to a method to calculate the
		// average
		double[] doubles = { 0, 0, 5, 5.6, 2.5, 2.5, 100 };
		System.out.println("\n10:::");
		System.out.print("doubles array: ");
		printArray(doubles);
		System.out.println("Average of elements in doubles: " + calcuateAverage(doubles));

		// 11
		// Creating another double array, and then passing it to a method that checks if
		// the first array has a greater average than the second
		double[] doubles2 = { 10, 10, 5, 5, 2, 2 };
		System.out.println("\n11:::");
		System.out.print("doubles2 array: ");
		printArray(doubles2);
		System.out.println("Does doubles have a larger average than doubles2? " + isAverageGreater(doubles, doubles2));
	}

	// 1.a & 1.b - Method to subtract the value of the first element from the last.
	// Works for any valid array length
	public static void subtractFirstFromLast(int[] array) {
		if (array.length > 0) {
			array[array.length - 1] -= array[0];
		}
		return;
	}

	// Method to print the elements in an int array to the console.
	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
		return;
	}

	// Overloading the printArray method, so it works for String arrays as well.
	public static void printArray(String[] array) {
		for (String word : array) {
			System.out.print(word + " ");
		}
		System.out.println();
		return;
	}

	// Overloading the printArray method, so it works for double arrays as well.
	public static void printArray(double[] array) {
		for (double num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
		return;
	}

	// 7
	// Takes a String and int as parameters, and then returning another String
	// that's the word concatenated to itself int number of times
	public static String repeatString(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(word);
		}
		return sb.toString();
	}

	// 8
	// Takes two strings for the first name and last name, then returns them
	// concatenated together with a space
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	// 9
	// Takes in an int array, and then checks if the sum is greater than 100
	public static boolean isSumGreaterThan100(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
			if (sum > 100) {
				return true;
			}
		}
		return false;
	}

	// 10
	// Takes a double array and then returns the average
	public static double calcuateAverage(double[] array) {
		double sum = 0;
		for (double num : array) {
			sum += num;
		}
		return sum / array.length;
	}

	// 11
	// Takes two double arrays and returns a boolean whether the first's average is
	// greater than the second's average
	public static boolean isAverageGreater(double[] first, double[] second) {
		int sum1 = 0;
		int sum2 = 0;
		for (double num : first) {
			sum1 += num;
		}
		for (double num : second) {
			sum2 += num;
		}
		return (sum1 / first.length) > (sum2 / second.length);
	}

}
