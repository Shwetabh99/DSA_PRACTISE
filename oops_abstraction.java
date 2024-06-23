/////////////// abstraction
abstract class animal{                  //using the keyword abstract to make animal abstract as its just a parent class
    String color;
    abstract void walk();
}
class horse extends animal{
    public void printcolor(){
        System.out.println(this.color);
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
public class Main
{
	public static void main(String[] args) {
      horse h1 = new horse();
      h1.color = "brown";
      h1.printcolor();
      h1.walk();
	}
}
