//Q8 -> Factorial using Recursion with Memoriazing
import java.util.Scanner;
class FactUsingRecurMemorization{
	static int[] F;
	public static void main(String[] args) {
		int n;
		F = new int[100];
		System.out.print("Enter n : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i=0; i<100 ; i++) {
			F[i] = -1;
		}

		int result = fact(n);
		System.out.println(result);
	}

	private static int fact(int n){
		if (n <= 1)
			return 1;

		if (F[n] != -1)
			return F[n];

		F[n] = fact(n-1) + fact(n-2);
		return F[n];
	}
}