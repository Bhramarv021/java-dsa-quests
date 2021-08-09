//Q5 -> Check array is sorted or not (int ascending order)
import java.util.Scanner;
class CheckSortedArray{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter size of an array : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] arr = new int[n];
		for (int i=0; i<n ; i++) 
			arr[i] = sc.nextInt();

		boolean isSorted = checkSorted(arr, n);
		if (isSorted == false) 
			System.out.println("Array is not sorted");
		else
			System.out.println("Array is sorted");
	}

	private static boolean checkSorted (int arr[], int n){
		
		// Array has one or no element or the
        // rest are already checked and approved.
		if (n==1 || n==0) {
			return true;
		}

		// Unsorted pair found (Equal values allowed)
		if (arr[n-1] < arr[n-2]) {
			return false;
		}

		// Last pair was sorted
        // Keep on checking
		return checkSorted(arr, n-1);
	}
}