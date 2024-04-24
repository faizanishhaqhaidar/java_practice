package lecture_13;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int a=2;
		int b=5;
		int res=power(a,b);
	   System.out.println(res);
	}
public static int power(int a,int b) {
	
	//base case
	if(b==0) {
		return 1;
	}
	// recursive case
	int ans=power(a,b-1);
	return ans*a;
}
}
