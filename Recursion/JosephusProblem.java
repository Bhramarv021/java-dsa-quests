// Q11 -> Josephus Problem 
// Its like death game, where n(number of persons) and k(persons to skip) is given
// And 1st person having gun and he/she kill the kth person....
// Find last person who survives using recursion.

import java.util.Scanner;
class JosephusProblem{
	public static void main(String[] args) {
		int n,k;
		System.out.print("Enter rows and columns of matrix : ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();

		int lastPerson = calcLastPersonSurvived(n,k);
		System.out.println(lastPerson);
	}

	private static int calcLastPersonSurvived(int n, int k){
		if (n==1)
			return 0;

		return (calcLastPersonSurvived(n-1,k)+k)%n;
	}
}