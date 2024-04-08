package lecture_5;
import java.util.*;
public class Reverse_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a= {1,2,3,4,5,6,7,8,9,23,4,56,71};
		
		
		display(a);
		System.out.println("revese in range 3 to 8");
		
		reverse(a,3,8);
		display(a);

	}
	public static void display(int [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void reverse(int [] a ,int i,int j) {
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;j--;
	}
	}

}
