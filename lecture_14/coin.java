package lecture_14;

public class coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3;
		coin(n," ");
		
		

	}
public static void coin(int n ,String ans) {
	
	//basecase
	if(n==0) {
		System.out.println(ans);
		return;
	}
	
	
	//recursive case
//	coin(n-1,ans+"H");
//	coin(n-1,ans+"T");
	
	if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
		coin(n - 1, ans + "H");
	}
	coin(n-1,ans+"T");
	
	
	
	
	
	
}
}
