import java.util.Scanner;
class RecordBreaker{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter size of an array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		// Declaring array with +1 elements so that we can easily compare last day value
		int arr[] = new int[n+1];
		System.out.println("Enter " +n+ " Elements ");
		for (int i=0; i<n ; i++) 
			arr[i] = sc.nextInt();

		int ans = 0;
		arr[n] = -1;
		int mx = -1;
		for (int i=0; i<n ; i++){
			if (arr[i]>mx && arr[i]>arr[i+1]){
				ans++;
			}
			mx = Math.max(arr[i], mx);
		}
		System.out.println(ans);

		/*int mx = 0;
		int recordDays = 0;
		for (int i=0; i<n ; i++) {
			if(i==0){
				mx = arr[0];
				if(arr[i+1]<mx)
					recordDays++;
			}
			else if(i==n-1){
				if(arr[n-1]>mx){
					recordDays++;
				}
			}
			else{
				if(arr[i]>mx){
					mx = arr[i];
					if(arr[i+1]<arr[i])
						recordDays++;
				}
			}
		}*/
		// System.out.println(recordDays);
	}
}