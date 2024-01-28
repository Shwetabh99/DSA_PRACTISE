import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Print fibonacci");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.println("Enter the value of n:");
		for(int i = 0;i<n;i++){
		    c = a+b;
		    System.out.println(a);
		    a=b;
		    b=c;
		}
	}
}
