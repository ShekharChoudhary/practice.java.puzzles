package array.puzzles;

import java.util.Arrays;

/**
 * Given an array of positive numbers, the task is to find the number of
 * possible contiguous subarrays having product less than a given number K.
 *  
 *  check the values for the following two inputs:-
 *  {1,2,3,4,5} max = 10
 *  {1,2,3,14,5} max = 10
 * @author choudshe
 *
 */
public class FindingSubArrayProduct2 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int maxProduct = 10;
		
		FindingSubArrayProduct2 product = new FindingSubArrayProduct2();
		product.getSubArray(arr, maxProduct);
	}

	private void getSubArray(int[] arr, int maxProduct) {
		
		
	}
}
