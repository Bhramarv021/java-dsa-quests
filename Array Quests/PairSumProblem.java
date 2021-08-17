import java.util.Scanner;
class PairSumProblem{
	public static void main(String[] args) {
		int n,s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		n = sc.nextInt();
		System.out.print("Enter Sum you want to find : ");
		s = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements : ");
		for (int i=0 ; i<n ; i++) 
			arr[i] = sc.nextInt();

		// Approach 2 : Using low and high variable
		// Use when array is sorted or otherwise sort the array first
		boolean ans = false;
		ans = findPair(arr, n , s);
		System.out.println(ans);

		// Approach 1 : Using brute force approach
		/*
		boolean ans = false;
		for (int i=0; i<n-1 ; i++) {
			for (int j=i+1; j<n ; j++) {
				if (arr[i] + arr[j] == s) {
					System.out.println(i + " " + j);
					ans = true;
					break;
				}
				if (ans == true) {
					break;
				}
			}
		}
			System.out.println(ans);
		*/
	}

	private static boolean findPair(int[] arr, int n, int s){
		int low, high;
		low = 0;
		high = n-1;
		while (low != high) {
			if (arr[low] + arr[high] == s){
				System.out.println(low + " " + high);
				return true;
			}			
			if (arr[low] + arr[high] > s) {
				high--;
			}
			if (arr[low] + arr[high] < s) {
				low++;
			}
		}
		return false;
	}
}