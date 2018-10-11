package tomtom.puzzles1;

import java.util.HashSet;

public class Parent {

	public static HashSet<Class> set = new HashSet<>();
	
	public Parent() {
	
		Class c = this.getClass();
		if(!set.contains(c)) {
			set.add(c);
		}else {
			try {
				throw new Exception("The class has already been instanciated");
			} catch (Exception e) {
			  e.printStackTrace();
			}
		}
	}
}
