package lecture_6;
import java.util.*;

public class kadens_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		
		
		
		int ans =Kadens(a);
		System.out.print(ans);
		
		
		

	}
	public static int Kadens(int []a )
	{
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				sum+=a[j];
				ans=Math.max(ans, sum);
				if(sum<0) {
					sum=0;
				}
			}
			
		}
		
		
		return ans;
	}
}
