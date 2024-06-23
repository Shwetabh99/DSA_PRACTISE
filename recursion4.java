public class Main
{
    public static int pow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int answer = x * pow(x,n-1);
        return answer;
    }
	public static void main(String[] args) {
		System.out.println("Print x to the power n in recursion");
		int ans = pow(2,7);
		System.out.println(ans);
	}
}
