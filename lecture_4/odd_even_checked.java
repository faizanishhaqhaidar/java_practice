package lecture_4;
import java.util.*;
public class odd_even_checked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr =new Scanner(System.in);
		int n=sr.nextInt();
		
		int odd_sum=0;
		int even_sum=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2!=0) {
				odd_sum+=rem;
			}
			else {
				even_sum+=rem;
			}
			n/=10;
		}
		
		
		if(even_sum%4==0 || odd_sum%3==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
// TODO Auto-generated method stub
//				for (byte i = 0; i < 128; i++) {
//					System.out.println(i);
//				}

//				for (byte i = 0; i <=127; i++) {
//					System.out.println(i);
//				}