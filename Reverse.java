/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		int length = s.length();
		int middle = length/2;
		String rev = "";
		int i = length;
		while (i!=0)
			{
				char c = s.charAt(i-1);
				rev = rev + c;
				i--;
			}
		System.out.println(rev);
		System.out.println("The middle character is " + rev.charAt(middle));


	}
}
