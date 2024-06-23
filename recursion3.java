public class Main
{
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factn = n* fact(n-1);
        return factn;
    }
	public static void main(String[] args) {
		System.out.println("Print factorial of a number using Recursion");
	int ans = 	fact(6);
	System.out.println(ans);
	}
}
