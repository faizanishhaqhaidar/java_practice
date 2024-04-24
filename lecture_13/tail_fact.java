package lecture_13;

public class tail_fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(tail_rec(n,1));
		
		

	}
	public static int tail_rec(int n,int ans) {
		
		// base case 
		if(n==1) {
			return  ans;
		}
		
		
		// recursive code 
		
		return tail_rec(n-1,n*ans);
		
	}

}
