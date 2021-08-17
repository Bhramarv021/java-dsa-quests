import java.util.Scanner;
class MaxSubarraySum{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements : ");
		for (int i=0 ; i<n ; i++) 
			arr[i] = sc.nextInt();

		// Approach 3 : Kadane's Algorithm
		// BEST APPROACH
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i=0; i<n ; i++) {
			currSum = currSum + arr[i];
			if (currSum < 0) {
				currSum = 0;
			}
			maxSum = Math.max(currSum, maxSum);
		}
		System.out.println(maxSum);

		// Approach 2 : cumulative Sum
		/*
		int[] currSum = new int[n+1];
		currSum[0] = 0;
  
		for (int i=1; i<=n ; i++) {
			currSum[i] = currSum[i-1] + arr[i-1];
			System.out.println("CURRSUM : "+currSum[i]);
		}

		int maxSum = Integer.MIN_VALUE;
		for (int i=1; i<=n ; i++) {
			int sum = 0;
			for (int j=0; j<i ; j++) {
				sum = currSum[i] - currSum[j];
				maxSum = Math.max(sum, maxSum);
				System.out.println("SUM AND MAXSUM : "+sum+" "+maxSum);
			}
		}
		System.out.println(maxSum);
		*/

		// Approach 1 : Brute Force Approach
		/*
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i=0; i<n ; i++) {
			for (int j=i; j<n ; j++) {
				for (int k = i; k<=j ; k++) {
					sum += arr[k];
					System.out.print(arr[k] + " ");
				}
				System.out.print(" Sum is : "+sum);
				System.out.println();
				maxSum = Math.max(maxSum, sum);
				sum = 0;
			}
		}
		System.out.println("Max sum is : "+maxSum);
		)
		*/
	}
}