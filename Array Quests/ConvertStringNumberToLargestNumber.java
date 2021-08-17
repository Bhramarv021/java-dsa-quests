import java.util.Scanner;
import java.util.*;
class ConvertStringNumberToLargestNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		String str = sc.next();

		char[] arr = str.toCharArray();
		// System.out.println(arr.length);

		// String ans;
		Arrays.sort(arr);

		for (int i=arr.length-1; i>=0 ; i--) {
			System.out.print(arr[i]);
		}

	}
}