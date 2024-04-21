package lecture_9;
import java.util.*;

public class longest_vowel_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr=new Scanner(System.in);
//		String s=sr.nextLine(); space ke baad bhi leta hai
		
		String s=sr.next();
		System.out.println(s);
		
		System.out.println(longest_vowel(s));

	}
	
	public static int longest_vowel(String s) {
		
		int ans=0;
		int c=0;
		
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(isvowel(ch)==true) {
				c++;
			}
			else {
				ans=Math.max(ans, c);
				c=0;
			}
		}
		
		ans=Math.max(ans, c);
		 return ans;
	}
   public static boolean isvowel(char c) {
	   
	   
	   if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u') {
		   return true;
	   }
	   return false;
   }
}


// input
//aioufghjiouea
//output 5
