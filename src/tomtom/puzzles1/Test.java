package tomtom.puzzles1;

/**
 * The purpose of this class is to show that we cannot create
 * more than one instance of this class.
 * @author choudshe
 *
 */
public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child1 c = new Child1();
		Child2 c2 = new Child2();
// we will get exception for the second instantiation of the classes		
		Child1 c1 = new Child1();
		Parent p1 = new Parent();
		Child2 c3 = new Child2();
	}
}
