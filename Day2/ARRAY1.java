import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Find the maximum & minimum number in an array of integers.");
		int arr[] = {3,4,1,13,12,27,48,23};
		int max=arr[1]; // let arr[1] be the max
		for(int i=0;i<8;i++){
		    if(arr[i]>max){
		        max = arr[i];  // replace arr[i] to max
		    }
		}
		System.out.println("Maximum value in an array is: "+max);
	}
}
