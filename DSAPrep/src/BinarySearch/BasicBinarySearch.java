// Binary Search can be  useful in sorted Arrays

package BinarySearch;

public class BasicBinarySearch {
	public static void main(String[] args) {
		int[] arr = {3, 7, 10, 12, 23, 27, 28, 31, 43, 56, 69, 70};
		int target = 50;
		int ans = Search(arr, target);
		System.out.println(ans);
	}
	
	public static int Search(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = (start + end) / 2; // start + ((end - start) / 2)

			if(arr[mid] == target) {
				return mid;
			}
			if(target > arr[mid]) {
				start = mid+1;
			}
			if(target < arr[mid]) {
				end = mid -1;
			}
		}
		return -1;
	}
}
