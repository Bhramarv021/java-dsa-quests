import java.util.Scanner;
class TransposeOfMatrix{
	public static void main(String[] args) {
		int n=5;
		int[][] arr = 
		{
			{1,5,7,9,10},
			{6,10,12,13,20},
			{9,25,29,30,32},
			{15,55,59,63,68},
			{40,70,79,81,95}
		};

		for (int i=0; i<n ; i++) {
			for (int j=0; j<n ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i=0; i<n ; i++) {
			for (int j=i; j<n ; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i=0; i<n ; i++) {
			for (int j=0; j<n ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}