package day08.practice;

import java.util.HashMap;
import java.util.Scanner;

public class DepartmentName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = scanner.nextLine();

		input = input.trim().toLowerCase();

		// Split the input into individual names using comma as the separator
		String[] names = input.split(", ");

		// Create a HashMap to store the count of each name
		HashMap<String, Integer> department = new HashMap<>();

		for (String name : names) {
			department.put(name, department.getOrDefault(name, 0) + 1);
		}

		System.out.println(department);

		scanner.close();
	}

}