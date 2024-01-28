import java.util.*;
public class Main
{
	public static void main(String[] args) {
	System.out.println("Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. ");
    System.out.println("Enter the total numbers to be taken");    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    int count1=0;
    int count2=0;
    int count3=0;
    for(int i = 0;i<n;i++){
        if(arr[i]>0){
            count1 = count1+1;
        }else if (arr[i]==0){
            count2 = count2+1;
        } else{
            count3 = count3+1;
        }
    }
    System.out.println("Count of positive number is: "+count1);
    System.out.println("Count of negative number is: "+count3);
    System.out.println("Count of zeros is: "+count2);
	}
}
