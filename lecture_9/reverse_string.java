package lecture_9;


import java.util.*;


public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sr =new Scanner(System.in);
		
		String s=sr.nextLine();
		System.out.println(s);
//		System.out.println(s.trim());// agle aur piche se space hatane ke liye
		
// bcjhbsd bdsdvbkh 
// bcjhbsd bdsdvbkh 
//bcjhbsd bdsdvbkh
		System.out.println(reverse(s));

	}
	public static String reverse(String s) {
		String ans=" ";
	    s=s.trim();
	     String[] a = s.split("\s+");// sprate karne ke liye
	     for(int i=a.length-1;i>=0;i--) {
		  ans+=a[i]+" ";
	      }
	
	
		
	      ans=ans.trim();
		
		return ans;
	}

}
