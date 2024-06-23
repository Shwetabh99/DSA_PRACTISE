/////////// polymorphism function overloading or compile time poly
class student{
    String name;
    int roll;
    
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int roll){
        System.out.println(roll);
    }
}
public class Main
{
	public static void main(String[] args) {
	   student s1 = new student();
	   s1.name = "shwetabh";
	   s1.roll = 51;
	   s1.printinfo(s1.name);
	   s1.printinfo(s1.roll);
	}
}
