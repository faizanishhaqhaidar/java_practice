package lecture_5;

public class swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {12,2,3,4,5,6,7};
		System.out.println(arr[0]+ "this is arr0 value "+arr[1]+ "this is the arr1 value ");
		swap(arr[0],arr[1]);
		
		System.out.println(arr[0]+" after swapinig "+arr[1]);// output is same because java is call by value not a call by refrence

	}
public static void swap(int a, int b) {
	int temp=a;
	a=b;
	b=temp;
}
}
