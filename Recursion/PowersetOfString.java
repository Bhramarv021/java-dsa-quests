// Q13 -> Get powerset / subset of the string
import java.util.Scanner;
class PowersetOfString{
	public static void main(String[] args) {
		String s;
		System.out.print("Enter set to get subsets or powerset : ");

		Scanner sc = new Scanner(System.in);
		s = sc.next();

		String currentString = "";

		powerSet(s, 0, currentString);
	}

	private static void powerSet(String s, int i, String cur){
		if (i == s.length()) {
			System.out.println(cur);
			return;
		}

		powerSet(s, i+1, cur + s.charAt(i));
		powerSet(s, i+1, cur);
	}
}