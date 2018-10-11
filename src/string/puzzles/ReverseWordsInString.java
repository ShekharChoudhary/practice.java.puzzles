package string.puzzles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		List<String[]> reversedArrayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int testCaseNo = sc.nextInt();
		
		for(int i =0;i<testCaseNo;i++) {
			String inputString = sc.next();
			String [] reversedString = reverseValue(inputString);
			reversedArrayList.add(reversedString);
		}
		
		for (String[] outputString : reversedArrayList) {
			int counter = outputString.length;
			for (String output : outputString) {
				counter--;
				System.out.print(output);
				if(counter>0) {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
	}

	private static String[] reverseValue(String inputString) {

		String [] inputArray = inputString.split("\\.");
		String [] reversedArray = new String [inputArray.length];
		
		
		for(int z =inputArray.length-1,i=0;z>=0;z--,i++) {
			reversedArray[i]=inputArray[z];
		}
		
		
		return reversedArray;
	}
}
