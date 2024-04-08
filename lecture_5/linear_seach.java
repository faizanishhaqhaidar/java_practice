package lecture_5;
import java.util.*;

public class linear_seach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {12,2,34,5,56,77,6};//this type is literal its means hard code value assign
Scanner sr =new Scanner (System.in);
int key=sr.nextInt();
linear_search(a,key);
	}
	public static void linear_search(int []b ,int value) {
		int c=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]==value) {
				c++;
			}}
		if(c>0) {
			System.out.print("the value is "+value);}
			else {
				System.out.println("the value is "+ value +" not found" );
			}
		
	}

}
