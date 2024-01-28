import java.util.*;
public class Main
{   
    public static int Avg(int a, int b, int c){
        return (a+b+c)/(3);
    }
	public static void main(String[] args) {
	System.out.println("Enter 3 numbers from the user & make a function to print their average.");
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter three numbers: ");
	int i = scn.nextInt();
	int j = scn.nextInt();
	int k = scn.nextInt();
	System.out.println("Average of these number is: "+Avg(i,j,k));
	}
}
