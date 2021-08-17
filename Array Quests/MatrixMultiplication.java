import java.util.Scanner;
class MatrixMultiplication{
	public static void main(String[] args) {
		int n1, n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1, n2, n3");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		System.out.println("N1 N2 N3 " + n1 + " " + n2 + " " + n3);

		int[][] arr1 = new int[n1][n2];
		int[][] arr2 = new int[n2][n3];

		// System.out.println("Enter array 1 of size : "+(n1*n2));
		for (int i=0; i<n1 ; i++) {
			for (int j=0; j<n2 ; j++) {
				// System.out.println(i + " " + j);
				arr1[i][j] = sc.nextInt();
			}
		}

		// System.out.println("Enter array 2 of size : "+(n2*n3));
		for (int i=0; i<n2 ; i++) {
			for (int j=0; j<n3 ; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		int[][] mult = new int[n1][n3];

		for (int i=0; i<n1 ; i++) {
			for (int j=0; j<n3 ; j++) {
				mult[i][j] = 0;
			}
		}	

		// Multiplication On matrix
		for (int i=0; i<n1 ; i++) {
			for (int j=0; j<n3 ; j++) {
				for (int k=0; k<n2 ; k++) {
					System.out.println("i j k "+i + " " + j + " " + k);
					mult[i][j] += arr1[i][k] * arr2[k][j]; 
				}
			}
		}

		for (int i=0; i<n1 ; i++) {
			for (int j=0; j<n3 ; j++) {
				System.out.print(mult[i][j] + " ");
			}
			System.out.println();
		}
	}
}