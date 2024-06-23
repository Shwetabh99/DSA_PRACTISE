///////////////////ARRAYLIST
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//defining ARRAYLIST  object
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// add StackTraceElement in arraylist one element is added after another variably
		list.add(0);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		// getting element
		int a = list.get(2);
		System.out.println(a);
		
		// to add element in between
		list.add(1,1);     // here 1 is added at index 1
		System.out.println(list);
		
		// set element
		list.set(0,5);  // 0th element will be set to 5
		System.out.println(list);
		
		//delete element
		list.remove(3);
		System.out.println(list); // 3rd index element will be deleted
		 
		 // size 
		 int s = list.size();
		 System.out.println(s);
		 
		 // to iterate
		 for(int i=0;i<list.size();i++){
		     System.out.println(list.get(i));
		 }
		 
		 // we can sort easily
		 Collections.sort(list);   // collection is a class in java which has sort named function 
		 // only for arraylist more dynamic
	}
}
