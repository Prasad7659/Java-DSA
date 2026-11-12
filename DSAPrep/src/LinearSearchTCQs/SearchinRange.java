package LinearSearchTCQs;

import java.util.Scanner;

public class SearchinRange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter desired target: ");
		int target = in.nextInt();
		int[] dataset = {56, 67, 23, 90, 78, 23, 76};
		int ans = SearchRange(dataset, -1, 4, target);
		System.out.println(ans);
		in.close();
	}
	
	public static int SearchRange(int[] arr, int start, int end, int target) {
		if(arr.length==0) {
			return -1;
		}
		
		if(end>arr.length) {
			return -1;
		}
		
		if(start<0) {
			return -2;
		}
		
		for(int i=start; i<=end; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
