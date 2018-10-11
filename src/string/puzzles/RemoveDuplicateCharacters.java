package string.puzzles;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String input = "aabbccddeeffgigggh";
		char [] inputArray = input.toCharArray();
		
		RemoveDuplicateCharacters removeDuplicateCharacters = new RemoveDuplicateCharacters();
		removeDuplicateCharacters.printUniqueList(inputArray);
	}

	private void printUniqueList(char[] inputArray) {
		int count =0;
		boolean flag = true;
		char [] newArray = new char [inputArray.length];
		for(int i =0;i<inputArray.length;i++){
			
			for(int j=0;j<count;j++){
				if(inputArray[i]==newArray[j]){
					flag = false;
					break;
				}else{
					flag = true;
					
				}
			}
			if(flag){
				newArray[count]=inputArray[i];
				flag = false;
				count++;
			}
		}
		
		for (char c : newArray) {
			System.out.print(c);
		}
	}
}
