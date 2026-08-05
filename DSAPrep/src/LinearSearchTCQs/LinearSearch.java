package LinearSearchTCQs;

import java.util.Scanner;

 //Search target in the integer array
public class LinearSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] sample = {18, 11, 16, 9, 90, 30};
		System.out.print("Enter the desired target to be Searched in the dataset: ");
		int target = in.nextInt();
		System.out.println("Your target " + target + " found at index " + Search(sample, target));
		in.close();
	}
	private static int Search(int[] arr, int target) {
		if(arr.length == 0) {
			return -1;
		}
		for(int i=0;i<arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
