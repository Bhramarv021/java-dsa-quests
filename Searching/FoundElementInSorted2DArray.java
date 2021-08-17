import java.util.Scanner;
class FoundElementInSorted2DArray{
	public static void main(String[] args) {
		int n,m,s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of 2D array n,m : ");
		n = sc.nextInt();
		m = sc.nextInt();
		System.out.print("Enter element you want to search : ");
		s = sc.nextInt();
		int[][] arr = new int[n][m];
		System.out.print("Enter array elements in sorted orded : ");
		for (int i=0 ; i<n ; i++){ 
			for (int j=0; j<m ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// Search Element in sorted array
		int r = 0, c = m-1;
		boolean ans = false;
		while (r < n && c >= 0) {
			if (arr[r][c] == s) {
				ans = true;
				break;
			}
			else if (arr[r][c] > s) {
				c--;	
			}
			else if (arr[r][c] < s) {
				r++;
			}
		}
		System.out.println(ans);
	}
}