package yash.online.test;

/**
 * Running this code will give stack overflow exception
 * @author choudshe
 *
 */
public class Test {

	Test t = new Test();
	public static void main(String[] args) {
		Test t1 = new Test();
	}
}
