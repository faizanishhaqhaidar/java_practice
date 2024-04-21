package lecture_8;
import java.util.*;

public class matrix_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a= {{1,2,3,4,5},{12,23,14,12,3},{7,8,9,4,5}};
        int item=14;
		
		System.out.println(search(a,item));
	}
public static boolean search(int [][]a, int item) {
	int r=0;
	int c=a.length-1;
	while(c>=0 && r<=a.length) {
		if(a[r][c]==item) {
			return true;
		} else if (a[r][c] > item) {
			c--;
		} else {
			r++;
		}
	}
	return false;
}
}
