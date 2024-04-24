package lecture_14;

public class all_possible_subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc";
		subseq(str," ");

	}
public static void subseq(String s,String ans) {
	
	// base case
	if(s.length()==0) {
		System.out.println(ans);
		return ;
	}
	
	
	
	
	//recursive case
	char ch=s.charAt(0);
	
	subseq(s.substring(1),ans);
	subseq(s.substring(1),ans+ch);
	
	
	
}
}
