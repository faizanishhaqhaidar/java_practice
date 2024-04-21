package lecture_9;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="hello";
		
		
//		System.out.println(s.substring(1));//output is ello
		
//		System.out.println(s.substring(1,3));//output is el
		
		
		
		Substring(s);

	}
	public static void Substring(String s) {
		
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
		
	}

}
