
public class Main
{
	public static void main(String[] args) {
		System.out.println("SELECTION SORT");
		int arr[] = {3,2,1,5,4};
		for(int i=0;i<arr.length-1;i++){
		    int smallest = i;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[j]<arr[smallest]){
		            smallest = j;
		        }
		    }
		    int temp = arr[smallest];
		    arr[smallest] = arr[i];
		    arr[i] = temp;
		}
		for(int i= 0;i<arr.length;i++){
		    System.out.print(arr[i] + " ");
	}
}
}