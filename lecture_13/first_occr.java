package lecture_13;

public class first_occr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	   int []a = {2,3,5,7,3};
	   int item=3;
	   System.out.print(index(a,item,0));
		

	}
	public static int index(int []a ,int item,int indx) {
		
		// base case
		if(item==a[indx]) {
		  return indx;
		}
		//  recursive case 
		return index(a,item,indx+1);
		
		
		
	}

}
