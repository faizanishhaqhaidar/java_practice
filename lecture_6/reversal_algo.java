package lecture_6;

public class reversal_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3,4,5,6,77,8,3,4,5,6,7};
		int  k=3;
		int i=0;
		int j=a.length-1;
		k=k%a.length;
		// all array rotate 
		reverse(a,i,j);
		//  array  rotate 0 to k-1 till;
		
		for(int n=0;n<a.length;n++) {
			System.out.print(a[n]+" ");
		}
		System.out.println(" ");
		reverse(a,0,k-1);
		
		
		//  array rotate k to n-1
		
		reverse (a,k,j);
		for(int n=0;n<a.length;n++) {
			System.out.print(a[n]+" ");
		}

	}
	
	public static void reverse(int [] a ,int i,int j) {
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;  j--;
		}
	}

}
