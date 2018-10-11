package threads.puzzles;


/**
 * check the order in which values are printed by the threads t1, t2 and t3
 * 
 * @author choudshe
 *
 */
public class StaticAndJoinTest {

	private String value;
	
	public StaticAndJoinTest(String value) {
		this.value = value;
	}
	
	public static synchronized void test1() {
		System.out.println("M1");
		System.out.println("M2");
	}
	
	public synchronized void test2() {
		System.out.println(value +"M1");
		System.out.println(value +"M2");
	}
	
	public static void main(String[] args) {
		StaticAndJoinTest staticAndJoinTest = new StaticAndJoinTest("O1");
		
		Thread t1 = new Thread(() ->  {
			staticAndJoinTest.test2();
		});
		
		Thread t2 = new Thread(() -> test1()  );
		Thread t3 = new Thread(() -> test1()  );
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
