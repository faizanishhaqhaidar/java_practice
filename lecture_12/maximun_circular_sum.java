package lecture_12;
import java.util.*;
public class maximun_circular_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {2,-1,3,4,-11,4,-18,7,5};
		
		
		int n =cir_sum(a);
		System.out.print(n);
		
		

	}
public static int cir_sum(int [] a) {
	int linear_sum=kadden(a);
	int sum=0;
	int ans=0;
	
	for(int i=0;i<a.length;i++) {
		sum+=a[i];
		a[i]=a[i]*-1;
	}
	int mid=kadden(a);
	
	int circular=mid+sum;
	if(circular<0) {
		return linear_sum;
	}
	
	
	ans=Math.max(linear_sum, circular);
	
	return ans;
	
	
}

public static int kadden(int []a ) {
	int sum=0;
	int ans=0;
	
	for(int i=0;i<a.length;i++) {
		sum+=a[i];

ans=Math.max(ans,sum);
if(sum<0) {
	sum=0;
}
	}	
		
return ans;	
	
}
}
