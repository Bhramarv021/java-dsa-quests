import java.util.Scanner;
class PowerOfN{
	public static void main(String[] args) {
		int n,pow;
		System.out.print("Enter number and power : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		pow = sc.nextInt();

		int ans = calcPower(n, pow);
		System.out.println(n + " Power "+pow + " is : "+ans);
	}

	private static int calcPower(int n, int pow){
		if(pow == 0)
			return 1;

		int prevProduct = calcPower(n, pow-1);
		return n * prevProduct;
	}
}