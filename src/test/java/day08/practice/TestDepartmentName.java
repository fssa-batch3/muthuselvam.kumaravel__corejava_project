package day08.practice;

import java.util.HashMap;
import java.util.Scanner;

public class TestDepartmentName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = scanner.nextLine();

		input = input.trim().toLowerCase();

		
		String[] names = input.split(", ");

		
		HashMap<String, Integer> department = new HashMap<>();

		for (String name : names) {
			department.put(name, department.getOrDefault(name, 0) + 1);
		}

		System.out.println(department);

		scanner.close();
	}

}