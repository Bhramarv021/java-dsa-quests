//Q4 -> Fibonacci of n using recursion
import java.util.Scanner;
class FibonacciOfNUsingRec{
	public static void main(String[] args) {
		int n;
		System.out.print("Enter number : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int ans = calcFib(n);
		System.out.println("Fibonacci of "+ n + " is : "+ans);
	}

	private static int calcFib(int n){
		if(n == 0 || n == 1)
			return n;

		// int prevFib = calcFib(n-1);
		// int prevPrevFib = calcFib(n-2);
		// return prevFib + prevPrevFib;

		return calcFib(n-1) + calcFib(n-2);
	}
}