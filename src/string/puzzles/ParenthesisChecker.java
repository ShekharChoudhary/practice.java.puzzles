package string.puzzles;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		String[] outputString = new String[testCase];
		for (int i = 0; i < testCase; i++) {
			String input = sc.next();
			char[] arr = input.toCharArray();
			outputString[i] = new ParenthesisChecker().checkIfParenthesisBalanced(arr);
		}

		for (String output : outputString) {
			System.out.println(output);
		}
		
	}

	private String checkIfParenthesisBalanced(char[] arr) {

		Stack<Character> p_stack = new Stack<>();
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
				p_stack.push(arr[i]);
			} else {
				char temp = 0;
				try {
					temp = p_stack.peek();
				} catch (EmptyStackException e) {
					return "not balanced";
				}
				if (arr[i] == ')' && temp == '(') {
					p_stack.pop();
				}else if (arr[i] == ']' && temp == '[') {
					p_stack.pop();
				}else if (arr[i] == '}' && temp == '{') {
					p_stack.pop();
				}else {
					flag = false;
				}
			}
		}

		if (p_stack.isEmpty() && flag) {
			return "balanced";
		} else {
			return "not balanced";
		}
	}
}
