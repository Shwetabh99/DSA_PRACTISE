import java.util.*;
public class Main
{
	    public static void sumN(int i, int n, int sum){
	        if(i==n){
	            sum = sum+i;
	            System.out.println("Sum is"+sum);
	            return;
	        }
	        sum = sum + i;
	        sumN(i+1,n,sum);
	    }
	    public static void main(String[] args) {
		System.out.println("Recursion2 print sum of n natural number");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number till which you want sum: ");
		int n = scn.nextInt();
		int sum=0;
		sumN(1,n,sum);
	}
}
