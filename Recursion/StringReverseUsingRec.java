// Q14 -> Reverse a String using recursion
import java.util.Scanner;
class StringReverseUsingRec{
	public static void main(String[] args) {
		String s;
		System.out.println("Enter a String : ");

		Scanner sc = new Scanner(System.in);
		s = sc.next();

		reverseString(s, s.length()-1);
	}

	private static void reverseString(String s, int n){
		if (n < 0) {
			return;
		}

		System.out.print(s.charAt(n));
		reverseString(s, n-1);
	}
}