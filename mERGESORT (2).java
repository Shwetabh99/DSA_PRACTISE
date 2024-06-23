public class Main
{
  public static void conquer (int[]arr, int starti, int mid, int endi)
  {
	int merged[] = new int[endi - starti + 1];	// creating an array for merged sorted 
	int idx1 = starti;			// one pointer at one divided array
	int idx2 = mid + 1;			// second pointer at start of second divided array
	int x = 0;					// to track index of merged array
	while (idx1 <= mid && idx2 <= endi)
	  {							// loop through the array
		if (idx1 <= idx2)
		  {						// comparing elements of divided array
			merged[x] = idx1;	// idx1 is less then put that element in merged array
			x++;
			idx1++;
		  }
		else
		  {
			merged[x] = idx2;
			x++;
			idx2++;
		  }
		// for remaining elements
		while (idx1 <= mid)
		  {
			merged[x] = idx1;
			x++;
			idx1++;
		  }
		while (idx2 <= endi)
		  {
			merged[x] = idx2;
			x++;
			idx2++;
		  }
		// now copying all element of merged array into original array
		for (int i = 0, j = starti; i < merged.length; i++, j++)
		  {
			arr[j] = merged[i];
		  }
	  }
  }
  public static void divide (int[]arr, int starti, int endi)
  {								//to divide we have to pass start and end Index
	if (starti >= endi)
	  {
		return;					// base case
	  }
	int mid = (starti + endi) / 2;
	//now dividing furter
	divide (arr, starti, mid);	// dividing index 0 to mid
	divide (arr, mid + 1, endi);	//dividing from mid+1 to end
	// now call conquer
	conquer (arr, starti, mid, endi);
  }
  public static void main (String[]args)
  {
	System.out.println ("MERGE SORT");
	int arr[] = { 6, 3, 9, 5, 2, 8 };
	int n = arr.length;
	// calling divide
	divide (arr, 0, n - 1);
	// printing
	for (int i = 0; i < arr.length; i++)
	  {
		System.out.println (arr[i]);
	  }
  }
}
