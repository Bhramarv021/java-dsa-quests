// Q7 -> Find first and last occurance in array using recursion
import java.util.Scanner;
class FindFirstLastOccurance{
	public static void main(String[] args) {
		int n,key;
		System.out.println("Enter size of an array : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		System.out.println("Enter key element to search : ");
		key = sc.nextInt();

		int[] arr = new int[n];
		for (int i=0; i<n ; i++) 
			arr[i] = sc.nextInt();

		System.out.println(checkFirstOccurance(arr, n, 0, key));
		System.out.println(checkLastOccurance(arr, n, 0, key));
	}

	private static int checkFirstOccurance(int arr[], int n, int i, int key){
		if(i==n){
			return -1;
		}

		if (arr[i] == key){
			return i;
		}

		return checkFirstOccurance(arr, n, i+1, key);
	}

	private static int checkLastOccurance(int arr[], int n, int i, int key){
		if (i==n) {
			return -1;
		}

		int restArr = checkLastOccurance(arr, n, i+1, key);

		if (restArr != -1) {
			return restArr;
		}

		if (arr[i] == key) {
			return i;
		}

		return -1;
	}
}