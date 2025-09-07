package flippy;

import java.util.Arrays;

public class WarmUp {
	
	/**
	 * Counts how many cards are hearts
	 * 
	 * @param cards an array of cards
	 * @return the number of cards that are hearts
	 */
	public static int countHearts(Card[] cards ){
		// TODO: fill in the method!
		int count = 0;
		for (Card c:cards)
		{
			if (c.getSuit() == "hearts")
			{
				count += 1;
			}
		}
		return count;
	}
	
	/**
	 * Add the elements of two arrays of the same length.  The function assumes that 
	 * the arrays are of the same length
	 * 
	 * @param array1
	 * @param array2
	 * @return a new array that is the element-wise sum of the input arrays 
	 */
	public static double[] addArraysSameLength(double[] array1, double[] array2){
		// TODO: fill in the method!
		double [] sum = new double[array1.length];
		for (int i = 0; i < array1.length; i++)
		{
			sum[i] = array1[i] + array2[i];
		}
		return sum;
		
	}
	
		
	// TODO: write the reverseArray method, including method header and JavaDoc comments
	public static String[] reverseArray(String[] s)
	{
		String temp = "";
		for (int i = 0; i < (s.length)/2; i++)
		{
			temp = s[i];
			s[i] = s[s.length - i - 1];
			s[s.length - i - 1] = temp;
		}
		return s;
	}

	public static void main(String[] args){
		String[] words = {"I", "love", "my", "CS", "classes", "!"};
		System.out.println("Before: " + Arrays.toString(words));
		reverseArray(words);
		System.out.println("After: " + Arrays.toString(words));
	}
}
