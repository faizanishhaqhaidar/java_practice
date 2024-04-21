package lecture_8;

public class tranfose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 4, 5 }, { 7, 8, 9, 6 }, { 3, 11, 15, 16 }, { 10, 12, 13, 14 } };
		
		
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println(" fdbkhdke");
	}
		transpose(a);
		
		
		
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[0].length;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println(" ");
}
		
	}

	public static void transpose(int [][] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a[0].length;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		
	}
}
