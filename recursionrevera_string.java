/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void rev(String str,int idx){
        if(idx==-1){
            return;
        }
        char curr = str.charAt(idx);
        System.out.println(curr);
        rev(str,idx-1);
    }
	public static void main(String[] args) {
		String str = "abc";
		rev(str,str.length()-1);
	}
}
