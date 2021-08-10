// Q12 -> Check string palindrome using recursion
import java.util.Scanner;
class PalindromeStringRecursion{
	public static void main(String[] args) {
		String s;
		System.out.println("Enter a string to check it is palindrome or not : ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();

		boolean isPalindrome = checkStringPalindrome(s,0,s.length()-1);
		System.out.println(isPalindrome);
	}

	private static boolean checkStringPalindrome(String s, int l, int r){
		if (l>=r)
			return true;

		if (s.charAt(l) != s.charAt(r))
			return false;

		return checkStringPalindrome(s, l+1, r-1);
	}
}