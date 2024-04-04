package lecture_1;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 6;
		int a = 0;
		int b = 1;
		
		
		for(int i=0;i<n;i++) {
			
		int	sum=a+b;
			a=b;
			b=sum;
			
		}
		
		System.out.println("the number of "+ n + "  position in fibo series  " +a);

	}

}
