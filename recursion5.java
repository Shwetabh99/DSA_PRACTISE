public class Main
{
    public static boolean sorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            // array is sorted till now
            return sorted(arr,idx+1);
        }
        else{
            return false;
        }
    }
	public static void main(String[] args) {
		System.out.println("Check if the array is sorted or not using recursion");
		int arr[] = {10,6,8};
		System.out.println(sorted(arr,0)); // 0 is the index
	}
}
