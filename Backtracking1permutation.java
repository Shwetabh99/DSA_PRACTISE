public class Main
{
    public static void perm(String str, String perm, int indx){
        // perm is empty string to store permutation
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);   // this will give the current Character
            String newStr = str.substring(0,i) + str.substring(i+1); // now we have removed the current char so that other can be placed
            // above if i=0 a is the first char so it is removed in newStr and newStr has now BC 
            perm(newStr, perm+currChar,indx+1); //indx +1 as we already filled indx
        }
    }
	public static void main(String[] args) {
	    System.out.println("Backtracking printing all the permutation for ABC");
		String str = "abc";
		perm(str,"",0);
	}
}
