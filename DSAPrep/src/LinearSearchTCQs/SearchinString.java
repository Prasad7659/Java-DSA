package LinearSearchTCQs;

import java.util.Scanner;

public class SearchinString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sc = "My name is Prasad";
		char target = in.next().charAt(0);
		int ans = (StringSearch(sc, target));
		System.out.println("Your target "+target+"was found at position "+ ans);
		in.close();
	}
	static int StringSearch(String str, char target) {
		if(str.length()==0) {
			return -1;
		}
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==target) {
				return i;
			}
		}
		return -1;
	}
}
