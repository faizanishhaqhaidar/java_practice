package lecture_1;

public class sum_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=23445;
		
		int sum=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			sum+=rem;
			num/=10;
			
		}
		
		System.out.println("the sum is "+sum);
	}

}
