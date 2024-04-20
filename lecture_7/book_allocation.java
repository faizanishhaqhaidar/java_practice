package lecture_7;

public class book_allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] pages= {10,20,30,40};
		int nos=2;
		
		
		int res=bookallocation(pages,nos);
		System.out.println(res);
		
	}
	public static int bookallocation(int [] pages,int nos) {
		int lo=0;
		int hi=0;
		int ans=0;
		for(int i=0;i<pages.length;i++) {
			hi+=pages[i];
		}
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(pages,nos,mid)==true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int [] page,int nos ,int mid) {
		
		int student=1;
		int readpages=0;
		for(int i=0;i<page.length;) {
			if(readpages+page[i]<=mid) {
				readpages+=page[i];
			     i++; }
			else {
				readpages=0;
				student++;
			    }
		
		if(student>nos) {
			return false;
		}
		
		}
	return true;
	}
}
