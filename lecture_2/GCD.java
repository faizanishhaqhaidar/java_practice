package lecture_2;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		int divisor=36;
//		the divisor is divide karne bala 
		int dividend=60;
//		int dividend is jisko divide karna hai 
		
		
		while(dividend%divisor!=0) {
			int rem =dividend%divisor;
			
			dividend =divisor;
			divisor =rem;
		}
		System.out.println("the gratest common divisor is "+divisor);

	}


	
}
