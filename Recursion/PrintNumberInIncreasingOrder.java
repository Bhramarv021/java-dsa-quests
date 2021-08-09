// Q6 -> Print number till n in increasing order
import java.util.Scanner;
class PrintNumberInIncreasingOrder{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter number : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		printTillNInDec(n);
		printTillNInInc(n);
	}

	private static void printTillNInDec(int n){
		if (n==1){
			System.out.println(n);
			return;
		}

		System.out.println(n + " ");
		printTillNInDec(n-1);
	}

	private static void printTillNInInc(int n){
		if (n==1) {
			System.out.println(n);
			return;
		}
		printTillNInInc(n-1);
		System.out.println(n);
	}
}