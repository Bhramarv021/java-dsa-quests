import java.util.Scanner;
class SubarrayWithGivenSum{
	public static void main(String[] args) {
		int n,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		n = sc.nextInt();
		System.out.println("Enter sum value : ");
		s = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " +n+ " Elements ");
		for (int i=0; i<n ; i++) 
			arr[i] = sc.nextInt();

		int start = -1, end = -1;
		int i = 0, j = 0, currSum = 0;

		while (j<n && ((currSum + arr[j] <= s))) {
			currSum += arr[j];
			// System.out.println("IN WHILE 1 : currSum : " +currSum);
			j++;
		}

		if (currSum == s) {
			System.out.println("IN SUM 1 : "+(i+1) + " " + j);
			System.exit(0);
		}

		while (j<n) {
			// System.out.println("IN WHILE 2");
			currSum += arr[j];
			while (currSum > s) {
				currSum -= arr[i];
				i++;
			}

			if (currSum == s) {
				start = i+1;
				end = j+1;
				break;
			}
			j++;
		}

		System.out.println(start + " " + end);

	}
}