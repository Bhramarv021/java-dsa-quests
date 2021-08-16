import java.util.Scanner;
class LinearSearchPractice{
	public static void main(String[] args) {
		int searchElement = 0;
		int n,j=0;
		int[] arr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter array lements : ");
		for (int i=0 ; i<n ; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter element you want to search for ! ");
		searchElement = sc.nextInt();
		for (j=0; j<n ;j++){
			if (arr[j] == searchElement){
				System.out.println("Your element is : "+searchElement + ", Found at index : "+j);
				break;
			}
		}
		if (j==n){
			System.out.println("Sorry! Your searching element is not present in array");
		}
	}
}