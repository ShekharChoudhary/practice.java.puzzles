package array.puzzles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given an array of positive numbers, the task is to find the number of possible 
 * contiguous subarrays having product less than a given number K.
 * 
 * The complexity of this code is O(n^2) and hence not very efficient.
 * 
 * @author choudshe
 *
 */
public class FindingSubArrayProduct1 {

	public static void main(String[] args) throws IOException {
		
		/*Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		FindingSubArrayProduct1 findSubarray = new FindingSubArrayProduct1();
		
		for (int x = 0; x < numberOfTestCases; x++) {
			int arrayLength = sc.nextInt();
			int maxProduct = sc.nextInt();
			int[] arr = new int[arrayLength];
			for (int y = 0; y < arrayLength; y++) {
				arr[y] = sc.nextInt();
			}

			findSubarray.getSubArray(arr,maxProduct);
		}*/
		
		
		/*
		int [] arr = {1, 9, 2, 8, 6, 4, 3};
		int maxProduct = 100;
		FindingSubArrayProduct1 findSubarray = new FindingSubArrayProduct1();
		findSubarray.getSubArray(arr,maxProduct);*/
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int numberOfTestCases = Integer.parseInt(br.readLine());
        FindingSubArrayProduct1 findSubarray = new FindingSubArrayProduct1();
		
        while (numberOfTestCases-- > 0) { 
        	String arrLengthNmaxValue = br.readLine();
        	String [] values = arrLengthNmaxValue.trim().split("\\s+");
        	int arrayLength = Integer.parseInt(values[0]);
        	int maxProduct = Integer.parseInt(values[1]);
        	String arrayValues = br.readLine();
        	String [] val = arrayValues.trim().split("\\s+");
        	
        	int [] arr = new int[arrayLength];
        	for(int i = 0;i<arrayLength;i++) {
        		arr[i] = Integer.parseInt(val[i]);
        	}
        	
        	findSubarray.getSubArray(arr,maxProduct);
        }

			
	}

	private void getSubArray(int[] arr,int maxProduct) {

		int minProduct =1;
		int countSubArrays = 0;
		boolean flag = true;
		for(int i =0;i<arr.length;i++) {
			int j = i;
			flag = true;
			minProduct =1;
			while(flag && j< arr.length)
			{
				minProduct = minProduct * arr[j];
				if(minProduct<maxProduct) {
					countSubArrays ++;
					j++;
				}else {
					flag = false;
					minProduct =1;
				}
			}
		}
		System.out.println(countSubArrays);
	}
}
