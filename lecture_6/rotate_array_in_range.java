package lecture_6;

public class rotate_array_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {2,3,4,5,3,5,6,67,86};
		int k =12;
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		rotate(a,k);
		
		
		for(int i=0;i<a.length;i++) {
			
	   System.out.print(a[i]+" ");
		}
		

	}
	
	public static void rotate(int []a,int k) {
		int n=a.length;
		System.out.println(n);
		k=k%n;
		System.out.println(k);
		// this loop is a k time rotate array
		for(int j=1;j<=k;j++) {
			//ek baar rotate array 
			int item=a[n-1];
			int i=n-2;
			//shifting array in 0 t0 1 and some as ahead 1 t0 2 
//			shifting last to 0 
			for(;i>=0;i-- ) {
				a[i+1]=a[i];
			}
			a[i+1]=item;
		}
		
	}

}
