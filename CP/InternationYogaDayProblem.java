//Codechef -> International Yoda Day -> Problem Code: RAMDEV
import java.util.Scanner;
// import java.util.Maths;
class InternationYogaDayProblem{
	public static void main(String[] args) {
		long li,bi,L,B,n,ans = 0;
		    Scanner sc = new Scanner(System.in);
	    	li = sc.nextLong();  
    		bi = sc.nextLong();
		    n = sc.nextLong();
		    for (int i=0; i<n ; i++){
		       	L = sc.nextLong();
    		    B = sc.nextLong();
    		    ans += Math.max((L/li)*(B/bi),(L/bi)*(B/li));  
		    } 
            System.out.println(ans);  

		/*long li,bi,L,B,n;
		Scanner sc = new Scanner(System.in);
		li = sc.nextLong();
		bi = sc.nextLong();
		n = sc.nextInt();
		L = sc.nextInt();
		B = sc.nextInt();

		int ans = Math.max(((L/li)*(B/bi)),((L/bi)*(B/li)));

		System.out.println(n*ans);*/

	}
}