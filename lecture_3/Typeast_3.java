package lecture_3;
import java.util.*;

public class Typeast_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				char ch = 'a';
				System.out.println((int) (ch));
				ch++;// ch = (char)(ch+1);
				System.out.println(ch);
				ch = (char) (ch + 1);
				System.out.println(ch);
				Scanner sc = new Scanner(System.in);
				ch=sc.next().charAt(1);//1 means take value of 1 index in user input
				System.out.println(ch);
				
				
				
				// TODO Auto-generated method stub
//				for (byte i = 0; i < 128; i++) {
//					System.out.println(i);
//				}

//				for (byte i = 0; i <=127; i++) {
//					System.out.println(i);
//				}

				for (byte i = 0; i < 127; i++) {
					System.out.println(i);
				}


	}

}
