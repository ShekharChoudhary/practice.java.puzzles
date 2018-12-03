package yash.online.test;

public class FibonacciTest {

	public static void main(String[] args) {
		FibonacciTest test = new FibonacciTest();
		System.out.println(test.fibonacciSimpleSum(1928372849));
	}
	
	private boolean fibonacciSimpleSum(int n) {

		 for(int i =0;i<=n/2 ; i++){
		   if(isFib(i)){
		     if(isFib(n-i)){
		      return true;
		     }
		   }
		 }
		 return false;
		}

		private boolean isFib(int num){
		 
		 return (isSqr(5*num*num+4) || isSqr(5*num*num-4));
		}

		private boolean isSqr(int num){
		 int x = (int) Math.sqrt(num);
		 boolean flag = (x*x == num);
		 return flag;
		}

}
