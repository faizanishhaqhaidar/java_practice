package lecture_6;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a ={12,3,43,5,2,1,23};
		
		for(int i=0;i<a.length-1;i++) {
		// find minimum index in all array
		
		int idx=miniindex(a,i);
		System.out.println(idx + " ");
		
		int temp=a[i];
		a[i]=a[idx];
		a[idx]=temp;	}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		} 
	}
	
	
	public static int miniindex(int [] a,int i) {
		int mini=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[mini]) {
				mini=j;
			}
		}
		return mini;
	}

}
