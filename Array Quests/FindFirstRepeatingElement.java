import java.util.Scanner;
import java.util.Arrays;
class FindFirstRepeatingElement{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter size of an array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " +n+ " Elements ");
		for (int i=0; i<n ; i++) 
			arr[i] = sc.nextInt();

		int max, minIndex;
		max = minIndex = Integer.MAX_VALUE;
		// System.out.println("Max is : "+max);
		max = Arrays.stream(arr).max().getAsInt();
		int[] idx = new int[max+1];
		
		for (int i=0; i<=max ; i++) {
			idx[i] = -1;
		}

		for (int i=0; i<n ; i++){
			int val = arr[i];
			if (idx[val] != -1) {
				minIndex = Math.min(minIndex, idx[val]);
			}
			else {
				idx[val] = i;
			}
		}

		if (minIndex == max) {
			System.out.println(-1);
		}
		else {
			System.out.println(minIndex + 1);
		}
	}	
}