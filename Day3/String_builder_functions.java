public class Main
{
	public static void main(String[] args) {
		// StringBuilder
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		// for char at index 0;
		System.out.println(sb.charAt(0));
		// with help of StringBuilder we can also modify string wwhich is otherwise not possible
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		// insert insert 
		sb.insert(0, 'S');
		System.out.println(sb);
		//delete by passing starting and ending index
		sb.delete(2,4);
		System.out.println(sb);
		//Append
		sb.append("S");
		System.out.println(sb);
		//length
		System.out.println(sb.length());
	}
}
