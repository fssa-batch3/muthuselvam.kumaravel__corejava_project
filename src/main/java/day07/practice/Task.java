package day07.practice;
import java.util.Scanner;

public class Task {

	
	
	  public static void main(String args[]) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int[] A = new int[n];
	    for (int i = 0; i < n; i++) {
	      A[i] = scanner.nextInt();
	    }
	    int icount = InversionCount(A, n);
	    System.out.println(icount);
	     }
	  public static int InversionCount(int[] A, int n) {
	    if (A == null) {
	      return -1;
	    }
	    if (n < 2) {
	      return 0;
	    }
	    int count = 0;
	    for (int i = 0; i < n - 1; i++) {
	      for (int j = i + 1; j < n; j++) {
	        if (A[i] > A[j]) {
	          count++;
	        }
	      }
	    }
	    return count;
	  }
	

}
