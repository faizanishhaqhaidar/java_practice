package lecture_3;
import java.util.*;
public class Inverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sr =new Scanner(System.in);
	   int n=sr.nextInt();
	   
	   
	   int p=1;
	   int sum=0;
	   while(n>0) {
		   int rem=n%10;
		   sum+=p*Math.pow(10,rem-1);
		   p++;
		   n/=10;
	   }
		
		
		System.out.println("the inverse number is "+ sum);

	}

}
