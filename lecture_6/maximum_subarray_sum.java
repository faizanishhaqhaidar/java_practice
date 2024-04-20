package lecture_6;

import java.util.*;

public class maximum_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		
		
		int sum=subarray_sum(a);
		
		System.out.println(sum+" ");
		
		
	}
	
     public static int subarray_sum(int [] a) {
	
	int ans=Integer.MIN_VALUE;
	
	for(int i=0;i<a.length;i++) {
		int sum=0;
	
	
	for(int j=i;j<a.length;j++) {
		sum+=a[j];
	
	ans=Math.max(sum, ans);
	
	}
     }
	return ans;
     }
}
