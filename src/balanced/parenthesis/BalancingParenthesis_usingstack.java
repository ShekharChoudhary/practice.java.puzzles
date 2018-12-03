package balanced.parenthesis;

import java.util.Stack;

/**
 * @author choudshe
 *
 */
public class BalancingParenthesis_usingstack {

	public static void main(String[] args) {
		String input = "(()){}[()()]";
		char[] inputArr = input.toCharArray();
		checkIfParenthesisIsBalanced(inputArr);
	}

	private static void checkIfParenthesisIsBalanced(char[] inputArr) {

		Stack<Character> stack = new Stack<>();
		char temp = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == '(' || inputArr[i] == '[' || inputArr[i] == '{') {
				stack.push(inputArr[i]);
			}else {
				temp = stack.peek();
			
				if(temp == '(' && inputArr[i]==')') {
					stack.pop();
				}
				if(temp == '[' && inputArr[i]==']') {
					stack.pop();
				}
				if(temp == '{' && inputArr[i]=='}') {
					stack.pop();
				}
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
	}
}
