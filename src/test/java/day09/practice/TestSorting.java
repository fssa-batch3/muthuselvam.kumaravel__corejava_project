package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestSorting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of inputs");
		int n = scanner.nextInt();
		
		ArrayList<Integer> cityNames = new ArrayList<Integer>();
		for (int i=0; i<n ; i++) {
			System.out.println("Enter value");
			int a = scanner.nextInt();
			cityNames.add(a);
			
			
		}
		
		

		System.out.println("Before Sort:" + cityNames);
		Collections.sort(cityNames);
		System.out.println("After Sort:" + cityNames);
	}
}