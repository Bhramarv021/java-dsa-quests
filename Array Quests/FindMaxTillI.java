//Question - Max Till i
import java.util.Scanner;
class FindMaxTillI{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter size of an array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " +n+ " Elements ");
		for (int i=0; i<n ; i++) 
			arr[i] = sc.nextInt();

		int mx = arr[0];
		for (int i=0; i<n ;i++) {
			mx = Math.max(mx, arr[i]);
			System.out.println(mx);
		}

		/*int[] maxArr = new int[n];

		for (int i=0; i<n ; i++) {
			int mx = arr[0];
			int j = i;
			while(j>0){
				if (arr[j]>mx) {
					mx = arr[j];
				}
				j--;
			}
			maxArr[i] = mx;
		}

		System.out.println("Max array is : ");
		for (int i=0; i<n ;i++ ) {
			System.out.print(maxArr[i] + " ");
		}*/
		
	}
}