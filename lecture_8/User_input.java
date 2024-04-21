package lecture_8;
import java.util.*;
public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sr=new Scanner(System.in);
		System.out.println("the given row value");
		int n=sr.nextInt();
		System.out.println("this is the col value in array");
		int m=sr.nextInt();
		int [] [] a=new int[n][m];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=sr.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
		}
		
	}

}
