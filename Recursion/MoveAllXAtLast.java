// Q17 -> Moving all x at end of the string
import java.util.Scanner;
class MoveAllXAtLast{
	public static void main(String[] args) {
		String s;
		System.out.println("Enter a String with 'x' : ");

		Scanner sc = new Scanner(System.in);
		s = sc.next();
		System.out.println(moveAllX(s));
	}

	private static String moveAllX(String s){
		if (s.length() == 0) {
			return "";
		}

		char ch = s.charAt(0);
		String ans = moveAllX(s.substring(1));

		if (ch == 'x') {
			return ans+ch;
		}

		return ch+ans;
	}
}