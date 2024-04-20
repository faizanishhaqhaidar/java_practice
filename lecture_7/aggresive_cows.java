package lecture_7;
import java.util.*;


public class aggresive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int [] stall= {1,2,4,8,9};
		int cows=3;
		
		
//		Arrays.sort(stall);
		
	int res=aggresive_cow(stall,cows);

       System.out.print(res+" ");
	
	
	}
	
	
	
	public static int aggresive_cow(int [] stall,int cow) {
		
		int ans=0;
		int lo=0;
		int hi=stall[stall.length-1]-stall[0];
		
		
		while(lo<=hi) {
			int mid =(lo+hi)/2;
			if(isitpossible(stall,cow,mid)==true) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
		
	}
	
	public static boolean isitpossible(int [] stall,int cow,int mid) {
		
		int pos=stall[0];
		
		int c=1;
		
		for(int i=1;i<stall.length;i++) {
			if(stall[i]-pos>=mid) {
				c++;
				pos=stall[i];
				}
		
		if(cow==c) {
			return true;
		}}
		return false;
	}

}
