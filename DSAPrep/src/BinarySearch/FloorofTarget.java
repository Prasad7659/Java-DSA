package BinarySearch;

public class FloorofTarget {

	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 12, 13, 17, 19, 22, 30, 34, 45, 88};
		int target = 8;
		int ans = floor(arr, target);
		System.out.println(ans);
	}
	
	public static int floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		
		if(target < arr[start]) {
			return -1;
		}
		
		if(target>arr[end]) {
			return arr[end];
		}
		
		while(start<=end) {
			mid = start + ((end - start)/2);
			if(target > arr[mid]) {
				start = mid+1;
			}
			else if(target < arr[mid]) {
				end = mid-1;
			}
			else {
				return arr[mid];
			}
		}
		
		return arr[end];
	}

}
