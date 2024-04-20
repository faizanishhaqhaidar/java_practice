package lecture_6;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {12,3,4,5,6,34,55,8,7};
		
	
		for(int i=1;i<a.length;i++) {
		
		insertlastelement(a,i);for(int l=0;l<a.length;l++) {
			System.out.print(a[l]+" ");
			
			}
		System.out.println(" ");
		
		
	}
		}
	public static void  insertlastelement(int [] a, int i) {
		int item=a[i];
		int j=i-1;
		while(j>=0&&a[j]>item) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=item;
		
	}

}
