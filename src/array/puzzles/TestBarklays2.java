package array.puzzles;

import java.util.Arrays;

public class TestBarklays2 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		int counter =0;
		while(counter <arr.length) {
		for(int i =0;i<arr.length-1 ;i++) {
			int count = i+1;
			if(arr[count] > arr[i]) {
				arr[count ] = arr[count] - arr[i];
				count ++;
			}
			
		}
		counter ++;
		Arrays.sort(arr);
		}
		long sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}
}
