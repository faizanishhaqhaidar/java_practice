package lecture_9;

public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		int[] arr = new int[5];
		System.out.println(arr.length);
		System.out.println(s1.length());
		
		// string unmutable 
		// string s7 me koi change nhi hota hai 
		
                 String	s7="hellow";
                 String g=s7+"bye";
                 
                 System.out.println(s7);
                  System.out.println(g);
		

	}

}
