package miscellaneous.puzzles;

public class TestLHRRHS {

	public static void main(String[] args) {
		TestLHRRHS test = new TestLHRRHS();
		 int a = 1;
		 int b = 1;
		System.out.println(test.compare(b,a));
	}
	
	public boolean compare(int a , int b) {
		if(a>b)
		return true;
		
		return false;
	}
}
