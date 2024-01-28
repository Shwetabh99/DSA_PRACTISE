import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Contains Duplicate");
		int a[] = {2,1,4,6,2,6,32};
		for (int i=0;i<6;i++){
		    int temp = a[i];
		    for(int j=i+1;j<6;j++){
		        if(a[j]==temp){
		            System.out.println("Duplicated number is: "+temp);
		        }
		    }
		}
		
	}
}
