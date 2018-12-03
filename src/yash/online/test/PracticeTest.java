package yash.online.test;

import java.util.HashSet;
import java.util.Set;

public class PracticeTest {

	public static void main(String[] args) {
		int n = 1928372849;
//		System.out.println(n);
		System.out.println(checkNumber(n));
	}

	private static boolean checkNumber(int n) {
		
		Set<Integer> list = new HashSet<>();
		
		int firstNum =0;
		int secondNum = 1;
		int fibno = 0;
		list.add(fibno);
		
		for (int i =0;i<=n;i++) {
			fibno = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = fibno;
			list.add(fibno);
			if(fibno > n) {
				break;
			}
		}
		
		for(int  i = 0;i<=n/2 ; i++) {
			if(list.contains(i)) {
				if(list.contains(n-i)) {
					  return true;
				}
			}
		}
		
		return false;
	}

	
	
	/*private static boolean checkFibonacci(int num) {

		ArrayList<Integer> list = new ArrayList<>();
		
		int firstNum =0;
		int secondNum = 1;
		int fibno = 0;
		if(fibno == num) {
			return true;
		}
		for (int i =0;i<=num;i++) {
			fibno = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = fibno;
			if(fibno == num) {
				return true;
			}
		}
		return false;
	}*/
}
