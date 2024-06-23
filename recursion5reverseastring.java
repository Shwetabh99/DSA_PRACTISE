public class Main
{
    public static void revs(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        revs(str,idx-1);
    }
	public static void main(String[] args) {
		System.out.println("REVERSE A STRING ABCD USING RECURSION");
		String str = "abcd";
		revs(str,str.length()-1);   // passing string and indexes to function
	}
}
