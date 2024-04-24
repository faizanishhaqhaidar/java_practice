package lecture_13;

public class tail_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int a=2;
		int b=5;
		int n=tail(a,b,1);
		System.out.println(n);
		
	}
public static int tail(int a, int b ,int ans) {
	
	// base case 
	if(b==0) {
		return ans;
	}// recursive case
//	    ans++;
	 return  tail(a,b-1,ans*a);
      
}
}
