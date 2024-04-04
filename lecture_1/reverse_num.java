package lecture_1;

public class reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num =134241;
		
		
		int rev=0;
		while(num>0) {
			int rem=num%10;
			
			rev=rev*10+rem;
			num/=10;
			
			
			
		}
		System.out.println("the reverse is "+rev);

	}

}
