package lecture_3;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// implexit type casting in octal if value start in with 0 
		int n=047;
		System.out.println(n);
		//type convet because byte range is -128 to127
		byte b = (byte) (140);
		System.out.println(b);
		//output is -116
		b = 2;
		System.out.println(b);//output is 2
		byte b1 = (byte) (300); // output is 44
		System.out.println(b1);
		byte c1 = (byte) (428);
		System.out.println(c1);//output-84
		int i = 17;
		i = b;
		b = -5;
		i = b;
		System.out.println(i +"number " +b);
		long l=768987997898888l;
		System.out.println(l);

	}

}
