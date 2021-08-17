import java.util.Scanner;
class SubarrayPatternPrint{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements : ");
		for (int i=0 ; i<n ; i++) 
			arr[i] = sc.nextInt();

		for (int i=0; i<n ; i++) {
			for (int j=i; j<n ; j++) {
				for (int k = i; k<=j ; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}
}
