package lecture_5;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {12,3,4,5,6,7,89};
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
System.out.println(" ");
int j=a.length-1;
Reverse(a,0,j);

for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
		
		
		
		
	}
	public static void Reverse (int []a ,int i,int j) {
		while(i<j) {
			int temp =a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}

}
