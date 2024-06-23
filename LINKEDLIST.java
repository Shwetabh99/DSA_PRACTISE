////////// linked list using collections framework

import java.util.*; // to import linked  list  

public class Main
{
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		// adding first
		list.addFirst("a");
		list.addFirst("is");   // first a is added but then is is added as first by moving the head to is
		System.out.println(list);
		// adding to the  last  
		list.addLast("the");
		System.out.println(list);
		list.add("was");
		System.out.println(list);
		// for size or total number of nodes 
		int totalnodes = list.size();
		System.out.println(totalnodes);
		
		//to traverse
		for(int i=0;i<totalnodes;i++){
		    System.out.print(list.get(i) + "-> ");
		}
		System.out.println("NULL");  //   as last node points to null
		
		// to remove first element that is to make next element the head
		list.removeFirst();
		System.out.print(list);
		
		// to remove from last
		list.removeLast();
		System.out.println(list);
	}
}
