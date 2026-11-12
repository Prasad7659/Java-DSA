package BinarySearch;

public class CeilofTarget {

	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 12, 13, 17, 19, 22, 30, 34, 45, 88};
		int target = 7;
		int ans = ceil(arr, target);
		System.out.println(ans);

	}
	
	public static int ceil(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		if(target > arr[end]) {
			return -1;
		}
		if(target < arr[start]) {
			return arr[start];
		}
		
		while(start<=end) {
			// mid = (start + end) / 2 /// mathematical midpoint
			// mid = start + ((Start  + end) / 2) ///mistake
			mid = start + ((end - start) / 2); // // Overflow-safe midpoint calculation to avoid integer overflow
			if(arr[mid]>target) {
				end = mid-1;
			}else if(arr[mid]<target) {
				start = mid+1;
			}
			else {
				return arr[mid];
			}
		}
		return arr[start];
	}
}