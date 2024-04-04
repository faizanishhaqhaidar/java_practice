package lecture_2;

public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int  mul=1;
		int sum=0;
		int p=n;
		
		while(n>0) {
			int rem=n%2;
			sum+=rem*mul;
			mul*=10;
			n/=2;
		}
		System.out.println("the decimal num of "+ p +" is binary num   "+sum);
		
		
		
	}

}
