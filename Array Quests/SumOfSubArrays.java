import java.util.Scanner;
class SumOfSubArrays{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter size of an array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " +n+ " Elements ");
		for (int i=0; i<n ; i++) 
			arr[i] = sc.nextInt();

		for (int i=0; i<n ; i++) {
			int sum = 0;
			for (int j=i; j<n ; j++) {
				sum += arr[j];
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}