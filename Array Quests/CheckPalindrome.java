import java.util.Scanner;
class CheckPalindrome{
	public static void main(String[] args) {
		char arr[] = new char[100];
		Scanner sc = new Scanner(System.in);
		arr = sc.next().toCharArray();

		int lastIndex = arr.length-1;
		boolean check = true;
		for (int i=0; (i<arr.length/2) && (check==true) ; i++) {
			if (arr[i] != arr[lastIndex-i]) {
				check = false;
				System.out.println("Not a palindrome");
				break;
			}
		}
		System.out.println(check);
	}
}