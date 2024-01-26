import java.util.*;
public class Main
{   
    public static int sumOdd(int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                sum = sum + i; 
            }
        }
        return sum;
    }
	public static void main(String[] args) {
    System.out.println("Write a function to print the sum of all odd numbers from 1 to n");
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter value of n:");
     int n= scn.nextInt();
    System.out.println("Sum of odd numbers is:"+ sumOdd(n));
	}
}
