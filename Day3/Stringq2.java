import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your email id: ");
		String s = scn.nextLine();
		String username = "";
		for(int i =0; i< s.length();i++){
		    if(s.charAt(i) == '@'){
		        break;
		    }else{
		        username = username + s.charAt(i);
		    }
		}
		System.out.println("User name is: "+username);
	}
}
