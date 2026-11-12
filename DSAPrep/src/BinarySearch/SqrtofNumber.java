package BinarySearch;

public class SqrtofNumber {

	public static void main(String[] args) {
		int ans = sqrt(27);
		System.out.println(ans);

	}
	
	public static int sqrt(int num) {
		int start = 1;
		int end = num;
		int mid = 0;
//		int ans = 0;
		
		while(start<=end) {
			mid = start + ((end-start)/2);
			int temp = mid * mid;
			if(temp<num) {
				start = mid+1;
//				ans = mid;
			}
			else if(temp>num) {
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return end; // return ans
	}

}
