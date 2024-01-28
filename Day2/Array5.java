/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Maximum Sub array: ")
		int a[] = {-2,3,1,-44,6,2,1,2};
		int n = a.length;
		int Sum=a[0];
		System.out.println("Our array is of length: "+n);
		for(int i=0;i<n;i++){
		    int temp = 0;
		    for(int j = i;j<n;j++){
		        temp = temp + a[j];
		        if(temp>Sum){
		            Sum =temp;
		        }
		    }
		}
		System.out.println("Sum of max Sub-array i: "+Sum);
	}
}
