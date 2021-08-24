// Q-> Find total number of occurance in sorted array / list
// Hint :- Use Binary Search 
import java.util.Scanner;
class CountTotalOccuranceInSortedList{
	public static void main(String[] args) {
		// int[] arr = {2,4,10,10,10,18,20};
		int[] arr = {1,1,3,3,5,5,5,5,5,9,9,11};
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to search : ");
		int se = sc.nextInt();
		int firstOccurance = findFirstOccurance(arr,n,se);
		int lastOccurance = findLastOccurance(arr, n, se);		
		int totalNum = lastOccurance - firstOccurance + 1;
		System.out.println(firstOccurance + " " + lastOccurance + " " + totalNum);
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
				System.out.println("R : "+result);
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