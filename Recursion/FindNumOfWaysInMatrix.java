// Q10 -> Find the number of ways in n*m matrix
import java.util.Scanner;
class FindNumOfWaysInMatrix{
	public static void main(String[] args) {
		int n,m;
		System.out.print("Enter rows and columns of matrix : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		int numOfWays = calcNumOfWaysInMatrix(n,m);
		System.out.println(numOfWays);
	}

	private static int calcNumOfWaysInMatrix(int n, int m){
		// If single row or single colomn
		// means there is only 1 way
		if (n==1 || m==1)
			return 1;

		return calcNumOfWaysInMatrix(n,m-1) + calcNumOfWaysInMatrix(n-1,m);
	}
}