/// single level inheritance
class shape{
    public class area(){
        System.out.println("Area of the shape is: ");
    }
}
class triangle extends shape{
    public void area(int l,int b){
        System.out.println(1/2*(l*b));
    }    
}
// multilevel inheritance
class equilateraltriangle extends triangle{
    public void area(int l,int b){
        System.out.println(1/2(l*b));
    }
}
// hirarchial inheritance means one parent class and various subclass
class circle extends shape{
    public void area(int r){
        System.out.println(3.14*(r)*(r));
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
