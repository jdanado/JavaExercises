import java.util.Arrays;
import java.util.Random;

/**
 * 
 */

/**
 * @author jdanado
 *
 */
public class GreatestDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[300];
		insertRandomNumbers(numbers);

		int diff = greatestDifference(numbers);
		System.out.println("The greatest difference is: " + diff);
	}
	/**
	 * Populates an int array with random numbers
	 * @param arr array to be populated
	 */
	public static void insertRandomNumbers(int[] arr) {
		// Random generator
		Random rand = new Random();
		
		// Pre-populate arrays
		for(int i=0;i< arr.length; i++) {
			arr[i] = rand.nextInt(1000);
		}
	}
	
	public static int greatestDifference(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1] - arr[0];
	}


}
