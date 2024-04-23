package lecture_11;

public class product_of_subarray_lessthan_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 1, 2, 3, 4, 2 };
		int k = 10;
		 
		
	     System.out.println(subarray_product(a,k));
		
		

	}
	
	public static int subarray_product(int[] a, int k) {
		
	int p=1;
	int si=0;
	int ei=0;
	int ans=0;
	while(ei<a.length) {
		
		p=p*a[ei];//grow window
		
		// srink array
		while(p>=k) {
			
			p=p/a[si];
			
			
			si++;
		}
		// ans 
		ans=ans+(ei-si)+1;
		ei++;
	}
	
	
	return ans;
		
		
	}

}
