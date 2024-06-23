/// inheritance example here triangle inherits data and functions of the parent class shape

class shape{
    String color;
    String type;
    
    public void printshape(){
        System.out.println("it is a triangle");
    }
}
class triangle extends shape{
    public void printcolor(){
        System.out.println(this.color);
    }
}
public class Main
{
	public static void main(String[] args) {
		triangle t1 = new triangle();
		t1.color = "blue";
		t1.printcolor();
		t1.printshape();
	}
}
