package lecture_5;
import java.util.*;
public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int []a=new int[n];
//		int a[]=new int [n] this is the c type declaration
		
		
		for(int i=0;i<n;i++) {
			a[i]=sr.nextInt();
		}
		display(a);
		
		
		
		
		

	}
	public static void display(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
