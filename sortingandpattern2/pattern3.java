public class Main
{
	public static void main(String[] args) {
		System.out.println("Inverted half pyramid");
		for(int i=0;i<4;i++){
		    for(int j=4;j>i;j--){
		        System.out.print("*" + " ");
		    }
		    System.out.println();
		}
	
	}
}
