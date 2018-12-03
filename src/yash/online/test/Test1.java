package yash.online.test;

public class Test1 {

	boolean fibonacciSimpleSum(int n) {

	    for(int i =0;i<=n/2;i++){
	        if(checkFibonacci(i)){
	            
	            if(checkFibonacci(n-i)){
	                return true;
	            }
	        }
	    }
	    return false;
	}

	private boolean checkFibonacci(int num){
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
	}
}
