// LeetCode (EASY) Quest -> 1539. Kth Missing Positive Number
class FindKthMissingPositiveInteger{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = 2;
        int ans = findKthPositive(arr, n);  
        System.out.println(ans);
    }

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int maxNum = arr[n-1];
        int minNum = arr[0];
        int[] ans = new int[n+k];
        int pos = 0; 
        
        for(int i=1; ; i++){
            int j=0;
            for(j=0; j<n; j++){
                if(i==arr[j]){
                    break;
                }
            }
            if(j==n){
                ans[pos] = i;
                pos++;
            }
            if(ans[k-1] > 0)
                break;
        }
        return ans[k-1];
    }
}