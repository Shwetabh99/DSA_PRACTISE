import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String s = scn.nextLine();
		String result = ""; //initialize empty string
		for(int i = 0;i< s.length();i++){
		    if(s.charAt(i) == 'e' ){
		        result = result + "i";
		    }else{
		        result = result + s.charAt(i);
		    }
		}
		System.out.println("New string is: "+result);
	}
}
