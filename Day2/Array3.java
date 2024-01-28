import java.util.*;
public class Main
{
	public static void main(String[] args) {
     System.out.println("Reverse the array: ");
     System.out.println("Enter the size of the array: ");
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int[] a = new int[n];
     System.out.println("Enter the element of the array");
     for(int i=0;i<n;i++){
          a[i] = scn.nextInt();
     }
     System.out.println("Array from the user is:");
     for(int j=0;j<n;j++){
         System.out.println(a[j]);
     }
     System.out.println("Reverse of the array entered is: ");
     for(int k=n-1;k>-1;k--){
         System.out.println(a[k]);
     }
	 }
}
