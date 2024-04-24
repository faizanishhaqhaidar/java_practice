package lecture_13;

public class print_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		print_inc(n);
		
		

	}
	
	public static void print_inc(int n ) {
		
		//base case 
		
		if(n==0) {
			return ;
		}
	
		// recursive case
        print_inc(n-1);
		System.out.println(n);
			
	}

}
