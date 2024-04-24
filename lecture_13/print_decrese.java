package lecture_13;

public class print_decrese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =6;
		print_decre( n );
		

	}
	public static void print_decre(int n ) {
		
		//base case 
		if(n==0) {
		return ;
		}
		
		
		
		
		
		// recursive call
		
		System.out.println(n);
		print_decre(n-1);
		
		
		
	}

}
