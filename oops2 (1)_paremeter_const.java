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
    // now we can create paremeterized Constructor
    pen(String color, String type){
        this.color = color;
        this.type = type;
    }
}
public class oops2
{
	public static void main(String[] args) {
		// creating a object and  paremeterized constructor is called by itself in java with name same as class
		pen pen1 = new pen("blue", "gel");
		pen1.printcolor();
	}
}
//// paremeterized constructor ////////////////////////
