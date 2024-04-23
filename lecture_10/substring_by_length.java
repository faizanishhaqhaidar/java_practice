package lecture_10;

import java.util.*;

public class substring_by_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    String s="abcd";
		    
		substrings(s);
		
		
		
		
	}
	
	public static void substrings(String s) {
		
		
		for(int len=1;len<s.length();len++) {
			for(int j=len;j<s.length();j++) {
				int i=j-len;
				System.out.println(s.substring(i,j));
			}
		}
		
		
	}

}
