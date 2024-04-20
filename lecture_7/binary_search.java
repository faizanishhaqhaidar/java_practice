package lecture_7;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a= {2, 3, 4, 5, 7, 8, 9, 11, 13, 17, 18, 19, 20, 21 };
		int item=18;
		
		
		
		System.out.print(binarysearch(a,item));
		
		
	}
public static int binarysearch(int [] a,int item) {
	int ans=0;
	
	int f=0;
	int l=a.length-1;
	while(f<=l) {
	int mid=(f+l)/2;
	if(a[mid]==item) {
		ans=mid;
		return ans;
	}
	else if(a[mid]<item) {
		f=mid+1;
	}
	else {
		l=mid-1;
	}
}
	
	
	return -1;
}
}
