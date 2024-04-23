




package lecture_11;

import java.util.*;
public class kartik_bhaiya {
	
	public static void main(String []args){
		
		    
		
		String s="aaaabaaababaaa";
		
		int k=2;
		
	
		
		int a= flip(s,k,'a');
		 
		int b=   flip(s,k,'b');
		
				
	int ans=Math.max(a, b);
	System.out.println(ans);
		
		

		
	}
	
	public static int flip(String s,int k ,char ch) {
		
		int ei=0;
		int si=0;
		int ans=0;
	     int f=0;
	
	while(ei<s.length()) {
		// growing 
		if(s.charAt(ei)==ch) {
			f++;
		}//shrinking
		while (f>k) {
			if(s.charAt(si)==ch) {
				f--;
			}
			si++;
		}
		
		
		ans = Math.max(ans, ei - si + 1);
		ei++;
	}
		
		return ans;
		
		
	}
	
	
	
	
}









