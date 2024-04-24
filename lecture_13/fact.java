package lecture_13;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=5;
		int res=fact(n);
		System.out.println(res);
		
	}	
	public static int fact (int n ) {
		
		// base case
		if(n==0|| n==1)
		{
			return n;
		}
		//recursive case;
		int f1=fact(n-1);
		return n*f1;
		
		
		
}

}
