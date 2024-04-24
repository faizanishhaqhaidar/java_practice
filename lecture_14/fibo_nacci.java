package lecture_14;

public class fibo_nacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6 ;
		   
		int res=fibo(n);
		
		System.out.println(res);
		

	}
	public  static int fibo(int n) {
		//basecase 
		if(n==0||n==1) {
			return  n;
		}
		
		
		return fibo(n-1)+fibo(n-2);
		// recursive 
	}

}
