package balanced.parenthesis;

import java.util.Stack;

/**
 * https://www.youtube.com/watch?v=smAi9Fh4R1c
 * Here we find the longest parenthesis sum prefix that means 
 * the prefix of the string should have balanced parenthesis and we have to find its length.
 * @author choudshe
 *
 */
public class LongestBalancedParenthesis_prefix_usingstack {

	public static void main(String[] args) {
		String input = "()(())((()";
		char[] inputArr = input.toCharArray();
		int length = getTheLength(inputArr);
		System.out.println("Length of Longest Parenthesis is : "+length);
	}

	private static int getTheLength(char[] inputArr) {
		int length =0;
		int largestLength =0;
		Stack<Character> stack = new Stack<>();
		char temp = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == '(' || inputArr[i] == '[' || inputArr[i] == '{') {
				stack.push(inputArr[i]);
			}else {
				temp = stack.peek();
			
				if(temp == '(' && inputArr[i]==')') {
					stack.pop();
					length +=2;
				}
				if(temp == '[' && inputArr[i]==']') {
					stack.pop();
					length +=2;
				}
				if(temp == '{' && inputArr[i]=='}') {
					stack.pop();
					length +=2;
				}
			}
			
			if(stack.isEmpty()) {
				largestLength = length;
			}
		}
		
	return largestLength;
	}
}
