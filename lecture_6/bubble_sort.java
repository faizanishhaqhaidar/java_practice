package lecture_6;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = {23,22 ,19 ,12 ,11,10, 8,5,3,1};
		  
		bubble_sort1(a);
		S ystem.out.println("bubble sort");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		bubble_sort(a);
		System.out.println("bubble sort");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
		public static void bubble_sort1(int [] a) {
			for(int i=0;i<a.length-1;i++) {
				for(int j=i+1;j<a.length-i;j++) {
					if(a[j]>a[j-1]) {
					int temp=a[j];
						a[j-1]=a[j];
						a[j]=temp;
					}
			}			}
	
		}
//	}
	//second way 
	
	public static void bubble_sort(int [] a) {
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		
	}

}
