package yash.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSorting {

	public static void main(String[] args) {
		FileSorting sorting = new FileSorting();
		sorting.divideIntoSubFiles(new File("C:\\MyWorkspace\\personal\\test\\temp.txt"));	
	}
	
	private void divideIntoSubFiles(File fileName) {
		// divide the given file into sub files of equal size
		// sort those subfiles by calling the method sortASubFile()
		// merge those subfiles by sorting the merged values using the method fileMerge()
	}
	
	private void fileMerge(File file1, File file2) {
		// merge these files by creating a new file and delete the files file1 and file2
	}
	
	private void sortASubFile(File fileName) {
		long filesize = fileName.length();
		filesize = filesize /1000;
		System.out.println(filesize);
		BufferedReader br = null;
	    String value = null;
	    
	    ArrayList<String> list = new ArrayList<>();
	    
	    try {
			br = new BufferedReader(new FileReader(fileName));
			while((value=br.readLine()) != null) {
				list.add(value);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("file is not present");
		} catch(IOException e) {
			System.out.println("error in reading file");
		}
		
	    String [] arr = list.toArray(new String[list.size()]);
	    System.out.println(arr.length);
		sortFile(arr);
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			for (String string : arr) {
				bw.write(string);
				bw.newLine();
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void sortFile(String [] values) {
		
		String largerValue =null;
		for(int i=0;i<values.length;i++) {
			
			for(int j =i+1;j<values.length;j++) {
				largerValue = compareLexographically(values[i], values[j]);
				if(largerValue.equals(values[i])) {
					values[i] = values[j];
					values[j] = largerValue;
				}
			}
			
		}
		
	}
	
	private String compareLexographically(String value1, String value2) {
		
		char [] arr1 = value1.toCharArray();
		char [] arr2 = value2.toCharArray();
		
		int length =0;
		String largestValue = null;
		
		if(arr1.length < arr2.length) {
			length = arr1.length;
			largestValue = value1;
		}else {
			length = arr2.length;
			largestValue = value2;
		}
		
		for(int i =0;i<length;i++) {
			if(arr1[i]>arr2[i]) {
				largestValue = value1;
				break;
			}else if(arr1[i]<arr2[i]){
				largestValue = value2;
				break;
			}
		}
		
		return largestValue;
	}
}
