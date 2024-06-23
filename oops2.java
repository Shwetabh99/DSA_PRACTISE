class pen{
    String color;
    String type;
    
    public void printcolor(){
        System.out.println(this.color);
    }
    // now this is a constrtuctor which need no paremter 
    pen(){
        System.out.println("Constructor is initialized");
    }
}
public class oops2
{
	public static void main(String[] args) {
		// creating a object and constructor is called by itself in java with name same as class
		pen pen1 = new pen(); // pen() is a non paremiterized constructor which is used to create object
		pen1.color = "blue";
		pen1.printcolor();
	}
}
