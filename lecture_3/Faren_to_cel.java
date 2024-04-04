package lecture_3;
import java.util.*;
public class Faren_to_cel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sr=new Scanner(System.in);
              int maxf=sr.nextInt();
              int minf=sr.nextInt();
              int step=sr.nextInt();
              
              
              
              while(minf<=maxf) {
            	  
            	  
            	  int c = (int) ((5 / 9.0) * (minf - 32));
            	  
            	 
            	 System.out.println(minf +"to" +c);
            	 minf+=step;
            	  
            	  
            	  
              }
	}

}
