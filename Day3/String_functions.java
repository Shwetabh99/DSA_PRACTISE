/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		// concatination
		String name1 = "tony";
		String name2 = "stark";
		String fullname = name1 + " " + name2;
		System.out.println("Full name after concat is: "+fullname);
		
		//length
		System.out.println(fullname.length());
		
		// CharAt 
		for(int i=0;i<name1.length();i++){
		    System.out.println(name1.charAt(i));
		}
		
		//Compare 
		if(name1.compareTo(name2)==0){
		    System.out.println("Strings are equal");
		}else{
		    System.out.println("String are not equal");
		}
	}
}
