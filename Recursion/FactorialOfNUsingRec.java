//Q3. Find factorial of n using recursion
//eg. n=5, so -> 5*4*3*2*1 = 120
import java.util.Scanner;
class FactorialOfNUsingRec{
	public static void main(String[] args) {
		int n;
		System.out.print("Enter number : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int ans = calcFact(n);
		System.out.println("Factorial of "+ n + " is : "+ans);
	}

	private static int calcFact(int n){
		if(n == 0)
			return 1;

		int prevFact = calcFact(n-1);
		return n * prevFact;
	}
}