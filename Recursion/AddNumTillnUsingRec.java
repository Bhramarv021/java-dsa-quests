// Quest -> Sum of all numbers till n
import java.util.Scanner;
class AddNumTillnUsingRec{
	public static void main(String[] args) {
		int n;
		System.out.print("Enter n : ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int s = sum(n);
		System.out.println("Sum till "+n+" is : "+s);
	}

	private static int sum(int n){
		if(n==0)
			return 0;

		int prevSum = sum(n-1);
		return (n + prevSum);
	}	
}