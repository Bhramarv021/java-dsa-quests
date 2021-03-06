// Q-> Find first and last occurance of a number
// Hint :- Use Binary Search 
import java.util.Scanner;
class FindFirstLastOccurance{
	public static void main(String[] args) {
		int[] arr = {2,4,10,10,10,18,20};
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to search : ");
		int se = sc.nextInt();
		int firstOccurance = findFirstOccurance(arr,n,se);
		int lastOccurance = findLastOccurance(arr, n, se);		
		System.out.println(firstOccurance + " " + lastOccurance);
	}

	private static int findFirstOccurance(int[] arr, int n, int se){
		int low = 0;
		int high = n-1;
		int result = -1;
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (arr[mid] == se) {
				result = mid;
				high = mid-1;
			}
			else if (arr[mid] > se) {
				high = mid-1;
			}
			else
				low = mid+1;
		}
		return result;
	}

	private static int findLastOccurance(int[] arr, int n, int se){
		int low = 0;
		int high = n-1;
		int result = -1;
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (arr[mid] == se) {
				result = mid;
				low = mid+1;
			}
			else if (arr[mid] > se) {
				high = mid-1;
			}
			else
				low = mid+1;
		}
		return result;
	}
}