package BitManipulation;

public class EvenOdd {

	public static void main(String[] args) {
		//a&1 = a last bit is 2 power 0 which decides odd or even
		int n = 17;
		
		if((n&1)==1) {
			System.out.print("odd");
		}else {
			System.out.print("even");
		}

	}

}
