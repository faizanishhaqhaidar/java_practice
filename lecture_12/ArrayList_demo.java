package lecture_12;
import java.util.*;
public class ArrayList_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Integer> list=new ArrayList<>();
		   
          System.out.println(list);
          
          // addd method
          list.add(1);
          System.out.println(list);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);
          list.add(6);
          list.add(7);
          list.add(8);
          list.add(9);
          list.add(10);
          System.out.println(list);
          list.add(1,34);// 1 index per 34 insert kr dega 
          System.out.print(list);
          // remove 
          
          
          list.remove(0);
          System.out.println(list);// remove the 1 index in the list

          
          // size 
          
          System.out.print(list.size());
          
          
           // update
          // in update in list we used set method          
          list.set(1,-23);
          System.out.println(list);
          
         
          
          // sort in list
          Collections.sort(list);
          
          
          // string in arraylist 
          
          
          ArrayList<String>str=new ArrayList<>();
          
          str.add("faiz");
          System.out.println(str);
          
          str.add("salman");
          str.add("rehan");
          str.add("fbvdfhkb");
          System.out.println(str);
          
          
          
          
          str.remove(0);
          System.out.println(str);
          // get method 
          System.out.println(str.get(2));
          
          
         for(int i=0;i<str.size();i++) {
        	 System.out.println(str.get(i));
         }
          
         for(String val:str) {
        	 System.out.print(val+" ");
         }
          
		
		
		
	}

}
