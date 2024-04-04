package lecture_2;

public class Bin_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int num=1010;
		
		
		int mul=1;
		int sum=0;
		
		while(num>0) {
			int rem=num%10;
			
			sum+=rem*mul;
			num/=10;
			mul*=2;
		}
		System.out.println(sum);
		
		
		

	}

}
