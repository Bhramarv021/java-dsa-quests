// Q-> Find Number of rotation in circular sorted array / list
// Hint :- Use Binary Search 
import java.util.Scanner;
class FindNumOfRotationInCircularSortedList{
	public static void main(String[] args) {
		// int[] arr = {2,4,10,10,10,18,20};
		// int[] arr = {1,1,3,3,5,5,5,5,5,9,9,11};
		int[] arr = {11,12,14,18,2,5,6,8};
		// int[] arr = {2,5,6,8};
		int n = arr.length;
		System.out.println(findRotationCount(arr,n));
	}
	private static int findRotationCount(int[] arr, int n){
		int low = 0;
		int high = n-1;
		while (low <= high){
			if (arr[low] < arr[high]) { // Case 1
				return low;
			}
			
			int mid = low + (high - low) / 2;
			int next = (mid + 1) % n;
			int prev = (mid + n - 1) % n;
			
			if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) { // Case 2
				return mid;
			}
			else if (arr[mid] <= arr[high]) {
				high = mid - 1;
			}
			
			else if (arr[mid] >= arr[low]) {
				low = mid + 1;
			}
		}
			return -1;
	}
}