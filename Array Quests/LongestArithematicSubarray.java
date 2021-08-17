// Kickstart Problem
// Apni kaksha L-8.4
import java.util.Scanner;
class LongestArithematicSubarray{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter size of an array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " +n+ " Elements ");
		for (int i=0; i<n ; i++) 
			arr[i] = sc.nextInt();

		int ans = 2;
		int pd = arr[1] - arr[0];
		int j=2;
		int curr = 2; 

		while (j<n) {
			if (pd == arr[j]-arr[j-1]) {
				curr++;
			}
			else {
				pd = arr[j] - arr[j-1];
				curr = 2;
			}
			ans = Math.max(ans,curr);
			j++;
		}

		System.out.println(ans);
	}
}