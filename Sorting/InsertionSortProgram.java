import java.util.Scanner;
class InsertionSortProgram{
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

		sortUsingInsertionSort(arr, n);
	}

	private static void sortUsingInsertionSort(int arr[], int n){
		for (int i=1; i<n; i++){
			int current = arr[i];
			int j=0;
			// Check if left side element is small then swap
			for (j=i-1; j>=0 && arr[j]>current ; j--){
				arr[j+1] = arr[j];
			}
			arr[j+1] = current;
		}
	
		for (int i=0; i<n ; i++) {
			System.out.println(arr[i]);
		}

		// Another way (Using while loop)
		/*for (int i=1; i<n ; i++) {
			int currentNum = arr[i];
			int j = i-1;
			while(arr[j]>currentNum && j>=0){
				arr[j+1] = arr[j];
				j--;
				if (j==-1) {
					break;
				}
			}
			arr[j+1] = currentNum;
		}*/
	}
}