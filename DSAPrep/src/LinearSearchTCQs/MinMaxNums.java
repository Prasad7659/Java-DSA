package LinearSearchTCQs;

//import java.util.Scanner;

public class MinMaxNums {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter desired target: ");
//		int target = in.nextInt();
		int[] dataset = {67, 12, 76, 89, 90, 56, 34, 59};
		int minNum = MinNum(dataset);
		int maxNum = MaxNum(dataset);
		System.out.println("Minimum number in Dataset is: "+minNum);
		System.out.println("Maximum number in Dataset is: "+maxNum);

//		in.close();
	}
	
	public static int MinNum(int[] arr) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int MaxNum(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}
