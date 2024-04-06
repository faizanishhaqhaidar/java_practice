package lecture_4;
import java.util.*;

public class is_armstrom {
	public static int cout_digit(int n ) {
		
		int c=0;
		while(n!=0) {
			n/=10;
			c++;
		}
		
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner sr=new Scanner(System.in);
int n=sr.nextInt();
int p=n;
int sum=0;
int c=cout_digit(n);
System.out.println(c);

while(n>0) {
	int rem=n%10;
	sum=(int )(sum+ Math.pow(rem, c));
	// kyuki math.pow method double me likha hua hai
	n/=10;
}
if(sum==p) {
	System.out.println("this is armstorme");
}
else {
	System.out.println("this is not aramstrome");
}

	}

}
