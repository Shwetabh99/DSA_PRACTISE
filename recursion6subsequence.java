public class Main
{
    public static void subs(String str, int idx, String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        // choice 1 that is to be in the String 
        subs(str, idx+1,newstr + currChar);
        // choice two that is to not be in the string 
        subs(str, idx+1,newstr);
    }
	public static void main(String[] args) {
		System.out.println("Print the subsequence of a string");
		String str = "abc";
		subs(str, 0, " ");
	}
}
