package lecture_11;
import java.util.*;
public class max_freq_in_given_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr =new Scanner(System.in);
		
		String s=sr.next();
		
		int n=max_freq(s);
		System.out.println(n+" ");
		

	}
	
	public static int max_freq(String s) {
		
		int ans=0;
		
		int [] freq= new int[26];
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			freq[ch-'a']=freq[ch-'a']+1;
			
			
		}
		for(int i=0;i<freq.length;i++) {
			ans=Math.max(ans, freq[i]);
		}
		
		
		
		
		
		return ans;
		
	}

}
