import java.util.*;
public class Main
{
	public static void main(String[] args) {

 	 System.out.println("Reverse the array");
	 int arr[] = {2,3,45,6,32};
	 int temp;
	 for(int i=0;i<(5/2);i++){
	     temp=arr[i];
	     arr[i] = arr[arr.length-i-1];
	     arr[arr.length-i-1] = temp;
	 }
	 System.out.println("Reversed array is: ");
	 for(int j=0; j<5;j++){
	     System.out.println(arr[j]);
	 }
	 }
}
