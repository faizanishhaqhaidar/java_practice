package lecture_9;

public class string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="naan";
		System.out.println(ispalin(s));

	}
	public static boolean ispalin(String s) {
		
		
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false ;
			}
			i++;j--;
		}
		return true;
		
	}

}
