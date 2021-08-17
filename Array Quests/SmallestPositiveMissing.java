import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class SmallestPositiveMissing{
	public static void main(String[] args) {		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements : ");
		for (int i=0 ; i<n ; i++) 
			arr[i] = sc.nextInt();

		// Approach 2 Using BOOLEAN check array
		final int N = (int)1e6 + 2;
		Boolean[] boolArr = new Boolean[N];
		
		for (int i=0; i<N ; i++)
			boolArr[i] = false;

		// int count = 0;
		for (int i=0; i<n ; i++) {
			if(arr[i] >= 0){
				boolArr[arr[i]] = true;
				// count++;
			}
		}

		int ans = -1;
		for (int i=0; i<N ; i++) {
			if (boolArr[i] == false){
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);


		// Approach 1 Using LIST
		/*List<Integer> l = new ArrayList<>();
		for (int i=0; i<n ; i++) {
			if(arr[i]>=0){
				Integer num = arr[i];
				l.add(num);
			}
		}
		int count = 0;
		for (int i=0; i<l.size() ; i++) {
			Integer num = i;
			if (l.get(num) != count) {
				System.out.println(i);
				break;
			}
			count++;
		}*/
	}
}