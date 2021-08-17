// Q17 -> Remove Duplicates from the String
class RemoveDuplicatesUsingRecursion{
	static String ans;
	public static void main(String[] args) {
		// String s = "aaaabbbeeecdddd";
		System.out.println(removeDup("aaaabbbeeecdddd"));
	}

	private static String removeDup(String s){
		if (s.length() == 0 || s.length() == 1){
			return "";
		}

		char ch = s.charAt(0);
		ans = removeDup(s.substring(1));
		System.out.println("CH and ANS : " + ch + " " + ans);

		if (ch == ans.charAt(0)){
			return ans;
		}

		return (ch+ans);
	}
}