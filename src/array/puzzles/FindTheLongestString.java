package array.puzzles;

import java.util.Arrays;
import java.util.HashSet;

import string.puzzles.Combinations;

/**
 * In input1 we are sending an array find out all possible words from input2 and check if it is present 
 * in input1 and then find the largest word formed by input2 which is present in input1. 
 * 
 * user permutation and not combinate 
 * @author choudshe
 *
 */
public class FindTheLongestString {

	
	public static void main(String[] args) {
		String [] input1 = {"apple","banana","carror"};
		
		String input2 = "lsdkaspsdpsdlwe";
		String output = longestString(input1, input2);
		
		
	}

	private static String longestString(String[] input1, String input2) {
		Combinations combobj = new Combinations(input2);
		combobj.combine();
		
		return null;
	}
	
	
}
