package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class TestHashInteger {

	public static void main(String[] args) {

		ArrayList<Integer> cityNames = new ArrayList<Integer>();
		cityNames.add(1);
		cityNames.add(2);
		cityNames.add(2);
		cityNames.add(3);

		System.out.println("Using ArrayList :" + cityNames);

		// Set stores unique elements and ignores duplication
		HashSet<Integer> cityNamesSet = new HashSet<Integer>();
		cityNamesSet.add(1);
		cityNamesSet.add(2);
		cityNamesSet.add(2);
		cityNamesSet.add(3);

		System.out.println("Using Set :" + cityNamesSet);
		for (int cityName : cityNamesSet) {
			System.out.println(cityName);
		}
		

	}
}
