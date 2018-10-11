package array.puzzles;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayHavingValue0_1_2 {

	public static void main(String[] args) {
		ArrayList<int []> outputList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int x = 0; x < testCase; x++) {
			int arrayLength = sc.nextInt();
			int[] arr = new int[arrayLength];
			for (int y = 0; y < arrayLength; y++) {
				arr[y] = sc.nextInt();
			}

			
			outputList.add(sortArray(arr));
		}
		
		for (int[] outputArr : outputList) {
			for(int i : outputArr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

	private static int[] sortArray(int[] arr) {

		int startCount = 0;
		int endCount = arr.length - 1;
		int[] sortedArr = new int[arr.length];
		for (int j = 0; j < sortedArr.length; j++) {
			sortedArr[j] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				sortedArr[startCount] = 0;
				startCount++;
			} else if (arr[i] == 2) {
				sortedArr[endCount] = 2;
				endCount--;
			}
			
		}
		return sortedArr;
	}
}
