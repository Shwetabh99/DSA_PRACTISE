/*import java.util.*;
public class Main
{
    public static void evenodd(int n){
        if(n%2 ==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scn.nextInt();
		evenodd(n);
	}
} */
class pen
{
  // blueprint of class pen
  // data
  String color;
  String type;					// ball,gel  
  // now function 
  public void write ()
  {
	System.out.println ("Writing");
  }
  public void printcolor ()
  {
	System.out.println (this.color);	// for data no parenthisis for function parenthisis
	// this is a keyword which will show which object to point
  }
}

public class oops
{
  public static void main (String[]args)
  {
	// creating an Object
	pen pen1 = new pen ();
	//accessing the Object
	  pen1.color = "blue";
	  pen1.type = "ball";		// these are properties

	pen pen2 = new pen ();
	  pen2.color = "black";
	  pen2.type = "gel";
	  pen1.write ();			// this is method  
	  pen2.printcolor ();
  }
}
