package homework3;
import java.util.Scanner;
public class EliminateDuplicates {

	public static void main(String[] args) {
		System.out.println(eliminateDuplicates("abracadabra")); 
		System.out.println(eliminateDuplicates("Stony Brook University")); 
		System.out.println(eliminateDuplicates("This is a test sentence.")); 
		System.out.println(eliminateDuplicates("Banana"));
		System.out.println(eliminateDuplicates("Calculus"));

	}
	public static String eliminateDuplicates(String str) {
		Scanner a = new Scanner(System.in);
		//str = a.nextString()
		String hold = "";
		for (int i = 0; i< str.length();i++) {
			int ab = str.charAt(i);
			//hold+= str.indexOf(i);
			String holdr = Character.toString(str.charAt(i));
			if (hold.contains(holdr)) {
				
			}
			else {
				//hold += "" +str.charAt(ab);
				hold += holdr;
			}
		
		}
		//str = "0";
		return hold;
	}
	/*public static int linearSearch(String list, String key) {
		String A = "";
		for (int i = 0; i < list.length(); i++)
		if (key.equals(list.charAt(list.indexOf(i)))) 
		return i;
		return -1;
		}*/


}
