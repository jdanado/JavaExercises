import java.util.Random;

/**
 * 
 */

/**
 * @author jdanado
 *
 */
public class FirstOccurence {

	private final static int AlphaSize = 256;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] st = getRandomString(1000);
		
		printString(st);
		
		int ch = getFirstUniqueInstance(st);
		if(ch == -1)
			System.out.println("No unique characters found");
		else
			System.out.println("First unique character is: " + ((char)ch));
	}
	/**
	 * Generates a random string with an alphabet size (e.g. 256)
	 * @param length length of the alphabet
	 * @return a char[] with the generated string
	 */
	public static char[] getRandomString(int length) {
		if (length < 1)
		      throw new IllegalArgumentException("length < 1: " + length);
		
		Random rand = new Random();
		char[] buf = new char[length];
		
		for(int i=0;i<length;i++) {
			buf[i] = (char) rand.nextInt(AlphaSize - 1);
		}
		return buf;
	}
	
	/**
	 * Calculates the first unique occurrence. First characters are counted and first indexes of a character are stored.
	 * @param st a char array with the string
	 * @return an int with the fist unique instance found, or -1 if not found
	 */
	public static int getFirstUniqueInstance(char[] st) {
		int[] counter = new int[AlphaSize];
		int[] indexes = new int[AlphaSize];
		for(int i=0; i < st.length; i++) {
			counter[(int)st[i]]++;
			if(indexes[(int)st[i]] == 0) {
				indexes[(int)st[i]] = i;
			}
		}
		int unique = -1;
		int index = Integer.MAX_VALUE;
		for(int i=0; i < AlphaSize; i++) {
			if(counter[i] == 1 && index > indexes[i]) {
				unique = i;
				index = indexes[i];
			}
		}
		return unique;
	}
	/**
	 * Prints a string
	 * @param st char[] with string
	 */
	public static void printString(char[] st) {
		System.out.println(new String(st));
	}
}