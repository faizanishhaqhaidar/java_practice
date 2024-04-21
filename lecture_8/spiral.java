package lecture_8;

public class spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		Print(a);

	}
	
	public static void Print(int [][]a) {
		int sr=0;
		int sc=0;
		int er=a.length-1;
		int ec=a[0].length-1;
		int c=0;
		int ce=a.length * a[0].length;;
		
		
		
//		System.out.print(ce);
		
		while(c<ce) {
		
		for(int i=sc;i<=ec&&c<ce;i++) {
			System.out.print(a[sr][i]);
			c++;
		}
		sr++;
		for(int j=sr;j<=er&&c<ce;j++) {
			System.out.print(a[j][ec]);
			c++;
		}
		ec--;
		
		for(int i=ec;i>=sc&&c<ce;i--) {
			System.out.print(a[er][i]);
			c++;
		}
		er--;
		for(int j=er;j>=sr&&c<ce;j--) {
		 System.out.print(a[j][sc]);
		 c++;
	         }
          sc++;
}}
}