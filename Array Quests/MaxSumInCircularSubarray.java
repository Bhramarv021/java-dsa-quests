import java.util.Scanner;
class MaxSumInCircularSubarray{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements : ");
		for (int i=0 ; i<n ; i++) 
			arr[i] = sc.nextInt();

		int wrapSum = 0;
		int nonWrapSum = 0;
		
		nonWrapSum = kadane(arr, n);

		int totalSum = 0;
		for (int i=0; i<n ; i++) {
			totalSum += arr[i];
			arr[i] = -arr[i];
		}

		wrapSum = totalSum + kadane(arr,n);

		System.out.println(Math.max(wrapSum, nonWrapSum));
	}

	private static int kadane(int[] arr, int n){
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i=0; i<n ; i++) {
			currSum += arr[i];
			if (currSum < 0) {
				currSum = 0;
			}
			maxSum = Math.max(maxSum, currSum);
		}
			return maxSum;
	}
}