package lecture_1;

import java. util.*;
public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sr =new Scanner(System.in);
		
		int n= sr.nextInt();
		int c=0;
		
		
		for(int i=2;i<n;i++) {
			
			
			if(n%i==0) {
				c++;
				
			}
		}
		if(c>=1) {
			System.out.println("this number is prime num");
			
		}
		else {
			System.out.println("this number ois prime ");
		}
		
		

	}

}
