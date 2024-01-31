import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter a matrix and search for a number if its there: ");
		Scanner scn = new Scanner(System.in);
		int arr[][] = new int[2][3];
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<2;i++){
		    for(int j=0;j<3;j++){
		        arr[i][j] = scn.nextInt();
		    }
		}
		System.out.println("Your given matrix is: ");
		for(int i=0;i<2;i++){
		    for(int j=0;j<3;j++){
		        System.out.print(arr[i][j]);
		    }
		    System.out.println();
		}
		System.out.println("Enter the number you want to search: ");
		int num = scn.nextInt();
		for(int i=0;i<2;i++){
		    for(int j=0;j<3;j++){
		        if(arr[i][j]==num){
		            System.out.println("Given number is present at th index at row"+i +"and at column"+j);
		        }
		    }
		}
	}
}
