import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 String str = "radar";
		 String rev = "";
		 for(int i=str.length()-1;i>=0;i--){
		     rev = rev + str.charAt(i);
		 }
		 if(str.toLowerCase().equals(rev.toLowerCase())){
		     System.out.println("String is a palindrome");
		 }
		 else{
		     System.out.println("no");
		 }
	}
}
