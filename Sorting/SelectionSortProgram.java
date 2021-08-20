import java.util.Scanner;
class SelectionSortProgram{
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

		sortUsingSelectionSort(arr, n);
	}
	private static void sortUsingSelectionSort(int[] arr, int n){
		for (int i=0; i<n-1 ; i++ ) {
			for (int j=i+1 ; j<n ; j++ ) {
				if(arr[j] < arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Sorted Array : ");
		for (int i=0; i<n ; i++)
			System.out.print(arr[i] + " ");
	}
}