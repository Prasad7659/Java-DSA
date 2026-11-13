package BitManipulation;

public class FindUnique {

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 6, 5, 4, 2, 6};
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			res = res^arr[i];
		}
		System.out.print(res);
	}

}
