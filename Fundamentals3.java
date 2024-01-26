import java.util.*;
public class Main
{   
    public static int greaterOfTwo(int a , int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
	public static void main(String[] args) {
    System.out.println("Write a function which takes in 2 numbers and returns the greater of those two.");
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter two number: ");
    int i = scn.nextInt();
    int j = scn.nextInt();
    System.out.println("Greater of two number is: "+greaterOfTwo(i,j));
	}
}
