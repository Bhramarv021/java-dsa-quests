// Q-> Binary Search Program
import java.util.Scanner;
class BinarySearchProgram{
	public static void main(String[] args) {
		int searchElement = 0;
		int n,j=0,elementIndex = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter array elements in SORTED manner : ");
		for (int i=0 ; i<n ; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter element you want to search for ! ");
			searchElement = sc.nextInt();

		elementIndex = searchElementUsingBinarySearch(arr,n,searchElement);	
		System.out.println("Element index is : "+elementIndex);
	}

	private static int searchElementUsingBinarySearch(int[] arr, int n, int se){
		System.out.println("IN FUNCTION");
		int s = 0;
		int e = n;
		while (s<=e) {
			int mid = (s+e)/2;
			if (arr[mid] == se){
				return mid;
			}
			else if (arr[mid] > se) {
				e = mid-1;
			} else {
				s = mid+1;
			}
		}
		return -1;
	}
}