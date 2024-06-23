
 
public class Main
{
    public static void printNum(int n){
        if(n==0){
            return;         //base condition
        }
        System.out.println(n);   // printing what is necessary which is doing own task
        printNum(n-1);       // recursive calling next thing to be printed
    }
	public static void main(String[] args) {
		System.out.println("Recursive print 5 to 1");
		printNum(5);
	}
}
