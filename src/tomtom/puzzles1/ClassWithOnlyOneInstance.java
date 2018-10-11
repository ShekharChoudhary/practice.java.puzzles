package tomtom.puzzles1;

public class ClassWithOnlyOneInstance {

	static boolean flag = false;
	public ClassWithOnlyOneInstance() {
		if(flag) {
			try {
				throw new Exception("One instance has already been created.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!flag)
		System.out.println("first instance created.");
		flag = true;
	}
	
	public static void main(String[] args) {
		ClassWithOnlyOneInstance firstInstance = new ClassWithOnlyOneInstance();
		ClassWithOnlyOneInstance secondInstance = new ClassWithOnlyOneInstance();
	}
}
