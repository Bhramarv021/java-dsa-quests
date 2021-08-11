// Q15 -> Repli "pi" with 3.14
import java.util.Scanner;
class ReplacePiWithValue{
	public static void main(String[] args) {
		String s;
		System.out.println("Enter a String : ");

		Scanner sc = new Scanner(System.in);
		s = sc.next();

		replacePiValue(s);
	}

	private static void replacePiValue(String s){
		if(s.length() == 0)
			return;

		if(s.charAt(0) == 'p' && s.charAt(1) == 'i'){
			System.out.print("3.14");
			replacePiValue(s.substring(2));
		}
		else{
			System.out.print(s.charAt(0));
			replacePiValue(s.substring(1));
		}
	}
}