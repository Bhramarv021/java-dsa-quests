import java.util.Scanner;
class BubbleSortProgram{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter "+n+" elements");
		for (int i=0; i<n ; i++ ) {
			arr[i] = sc.nextInt();
		}

		sortUsingBubbleSort(arr, n);
	}
	private static void sortUsingBubbleSort(int arr[], int n){
		for (int i=0; i<n-i ; i++){
			for (int j = 0; j<n-1-i ; j++) {
				if (arr[j] > arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
				}	
			}
		}

		System.out.println("Sorted Array : ");
		for (int i=0 ; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}