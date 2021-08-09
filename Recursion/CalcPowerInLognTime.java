//Q9 -> Calculate power of n in o(logn) time
import java.util.Scanner;
class CalcPowerInLognTime{
	public static void main(String[] args) {
		int n,p;
		System.out.print("Enter number and power to calculate : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = sc.nextInt();

		System.out.println(pow(n,p));		
	}	

	private static int pow(int n, int p){
		if (p==0)
			return 1;
		else if(p%2 == 0){
			int y = pow(n, p/2);
			return y*y;
		}
		else
			return n * pow(n, p-1);
	}
}