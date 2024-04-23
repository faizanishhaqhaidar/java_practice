package lecture_11;

public class k_length_maximun_sum {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		
		int [] a= {1,2,3,4,5,0};
		int k=3;
		int res=maximum(a,k);
		System.out.println(res);
	}
       public static int maximum(int [] a,int k) {
	// complexity is o(n)~2
//	     int ans=0;
//	     int sum=0;
    	 
//	     for(int i=0;i<a.length;i++) {
//	    	   
//	    	 for(int j=i;j<k+i&&j <a.length;j++) {
//	    		 sum+=a[j];
//	    		 
//	    	   }
//	    	   ans=Math.max(ans, sum);
//	    	   sum=0;
//	    	 
//	            }
//	
    	   // we use then sliding windows o(n)
    	   
    	   
    	   int ans=0;
    	  
    	   int sum=0;
    	  
    	   for(int i=0;i<k;i++) {
    		   sum+=a[i];
    	   }
    	   ans=sum;
    	   for(int i=k;i<a.length;i++) {
    	    sum-=a[i-k];// shrink
    	    sum+=a[k]; // window grow
    	    ans=Math.max(ans, sum);
    		   
    		     }
    	   
    	   
	
	     return ans;
	
          }
           }
