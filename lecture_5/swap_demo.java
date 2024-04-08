package lecture_5;

public class swap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,2,3,4,5,6};
		int [] other= {10,1,2,3,4,5};
		
		
		System.out.println(arr[0]+" "+other[0]);
		
swap(arr,other);//output same as the above because java is call by call hai
System.out.println(arr[0]+" "+other[0]);

	}
public static void swap(int [] a, int [] b) {
	int []temp=a;
	a=b;
	b=temp;
}
}
