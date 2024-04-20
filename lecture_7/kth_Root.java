package lecture_7;
import java.util.*;
public class kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 143;
		int k=3;
	
		int result=kth_root(n,k);
		System.out.println(result +" ");
	}
	public static int kth_root(int n ,int k) {
		int ans=0;
		int lo=1;
		int hi=n;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(Math.pow(mid, k)<=n) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		
		
	return ans;	
	}

}
