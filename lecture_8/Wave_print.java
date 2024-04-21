package lecture_8;

public class Wave_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
wave(a);


	}
public static void wave(int [][]a) {
	
	for(int col=0;col<a[0].length;col++) {
		if(col%2==0) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j][col]+" ");
			}
		}
		
		else {
			for(int j=a.length-1;j>=0;j--) {
				System.out.print(a[j][col]+" ");
			}
			
			
		}
		System.out.println(" ");
	}
	
	
}
}
