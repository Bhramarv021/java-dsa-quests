import java.util.Scanner;
class SpiralOrderPrint{
	public static void main(String[] args) {
		int n=5, m=6;
		int[][] arr = {{1,5,7,9,10,11},{6,10,12,13,20,21},{9,25,29,30,32,41},{15,55,59,63,68,30},{40,70,79,81,95,105}};

		int rowStart = 0, rowEnd = n-1, colStart = 0, colEnd = m-1;
		while (rowStart <= rowEnd && colStart <= colEnd) {
			
			//for rowStart print
			for (int col=colStart; col<=colEnd ; col++)
				System.out.print(arr[rowStart][col] + " ");
			rowStart++;

			//for colEnd print
			for (int row=rowStart; row<=rowEnd ; row++)
				System.out.print(arr[row][colEnd] + " ");
			colEnd--;

			//for endRow print
			for (int col=colEnd; col>=colStart ; col--) 
				System.out.print(arr[rowEnd][col] + " ");
			rowEnd--;

			for (int row=rowEnd; row>=rowStart ; row--) 
				System.out.print(arr[row][colStart] + " ");	
			colStart++;
		}
	}
}