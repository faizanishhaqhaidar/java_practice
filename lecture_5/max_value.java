package lecture_5;
import java.util.*;
public class max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {12,3,4,56,2,3,4};
int max_val=Integer.MIN_VALUE;

System.out.println(max_value(arr,max_val));
	

	}
	public static int  max_value(int []b,int value) {
		for(int i=0;i<b.length;i++) {
//			if(value<b[i]) {
//				value=b[i];
//			}
			value=Math.max(value, b[i]);
			
		}
		return value;
	}

}
