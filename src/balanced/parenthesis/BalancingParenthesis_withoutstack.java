package balanced.parenthesis;
/**
 * This can only be done on one type of parenthesis i.e. either '(' or '{' or '['
 * @author choudshe
 *
 */
public class BalancingParenthesis_withoutstack {

	public static void main(String[] args) {
		String input = "()()()(()()";
		char [] inputArr = input.toCharArray();
		checkIfParenthesisBalanced(inputArr);
	}
	
	private static void checkIfParenthesisBalanced(char [] inputArr) {
		int count =0;
		for(int i =0;i<inputArr.length;i++) {
			if(inputArr[i]=='(') {
				count ++;
			}else {
				count --;
			}
		}
		
		if(count ==0) {
			System.out.println("Balanced");
		}else {
			System.out.println("not balanced");
		}
	}
}
