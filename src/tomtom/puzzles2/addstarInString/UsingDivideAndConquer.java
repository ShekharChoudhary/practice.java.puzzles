package tomtom.puzzles2.addstarInString;

public class UsingDivideAndConquer {

	static int count =0;
	
	public static void main(String[] args) {
		String value = "abcd";
		char [] inputArr = value.toCharArray();
//		char [] outputArr = new char[inputArr.length+(inputArr.length-1)];
		divide(inputArr);
	}
	
	public static void divide(char [] inputArr) {
		
		
		if(inputArr.length <2) {
			return ;
		}
		
		int leftLength = inputArr.length/2;
		int rightLength =inputArr.length-leftLength;
		
		char [] leftArray = new char[leftLength];
		for(int i =0;i<leftLength;i++) {
			leftArray[i] = inputArr[i];
		}
		char [] rightArray = new char[rightLength];
		for(int j =0;j<rightLength;j++) {
			rightArray[j] = inputArr[rightLength+j];
		}
		divide(leftArray);
		divide(rightArray);
		
		merge(leftArray,rightArray);
	}

	private static void merge(char[] leftArray, char[] rightArray) {
		
	int newArrLen = leftArray.length + rightArray.length + 1;
    char [] finalArray = new char[newArrLen];
	for(int i =0;i<newArrLen;i++) {
		if(i<leftArray.length) {
			finalArray[i] = leftArray[i]; 
		}else if(i==leftArray.length) {
			finalArray[i]='*';
		}else {
			finalArray[i] = rightArray[i-(rightArray.length+1)];
		}
		
	}
	 
		
	}
}
