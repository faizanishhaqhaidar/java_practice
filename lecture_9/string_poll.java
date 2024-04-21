

package lecture_9;

public class string_poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s1="hello";
	     String s2="bye";//string poll me banta hai address
	     String s4=new String("hello");// s1 and s4 not a some new poll se bahar banta hai
	     
	     String s=s1+s2;// because it is working behaviour new kewboard
	     System.out.println(s);
	     
	     
	     String s3="hellobye";
	     System.out.println(s==s3);
	     
	     
	     String  s6=s1.concat(s2);
	     System.out.println(s6==s3);
	     
	     
	     String s7="hbfdhb"+s1;
	     String s8= "kaju"+"katli";//only this type equation working upon  string poll
	     String s9="kajukatli";//it is used same address in the string poll 
	     
	     System.out.println(s8==s9);
	     
	     
	}

}
