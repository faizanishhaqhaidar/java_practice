package lecture_5;

public class swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int [] a= {1,2,3,4,55,5,6};
		System.out.println(a[0]+" this si the a0 value "+a[1]+ "this is the a1 value "+a[1]);
swap(a,0,1);

System.out.println(a[0]+ " after swaping value of array0 and a1 "+ a[1]+" this is a1 value");

		
		
		
	}
public static void swap(int []a ,int i, int j) {
	
	
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	
	
}
}
