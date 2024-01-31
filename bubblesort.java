
public class Main
{
     public static void printarr(int arr[]){
	        for(int i=0;i<arr.length;i++){
	            System.out.print(arr[i] + " ");
	        }
	    }
	public static void main(String[] args) {
		System.out.println("Bubble sort");
		int arr[] = {3,6,2,4};
		for(int i = 0; i<arr.length-1;i++){     // looping for 3 times as we have 4 element
		    for(int j=0;j<arr.length-i-1;j++){
		        if(arr[j]>arr[j+1]){
		        int temp = arr[j];
		        arr[j] = arr[j+1];
		        arr[j+1] = temp;        // swapping nth index to nth+1 index if its greater
		    }
		}
		    
		}
		printarr(arr);
	}
}
