package lecture_9;
import java.util.*;
public class lexcograghical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="komal";
		String s2="kamal";
		
		
//		System.out.println(s1.compareTo(s2));
//if +ve is s1 bada hai
// if -ve s2 bada hai
		//if 0 equal
		
		
		System.out.println(compareto(s1,s2));
	}
	public static int compareto(String s1,String s2) {
		
		int ans=0;
		
		if(s1==s2) {
			return 0;
		}
		int len =Math.min(s1.length(), s2.length());
		
		for(int i=0;i<len;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
			
		}
		
		
		
		return s1.length()-s2.length();
	}

}
