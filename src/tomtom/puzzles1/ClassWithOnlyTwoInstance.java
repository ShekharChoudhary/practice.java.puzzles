package tomtom.puzzles1;

public class ClassWithOnlyTwoInstance {

 
	 static int counter =0;
	 
	public ClassWithOnlyTwoInstance () {
		if(counter>=2) {
			try {
				throw new Exception("Two instances already created.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			counter++;
		}
	}
	
	public static void main(String[] args) {
		ClassWithOnlyTwoInstance firstInstance = new ClassWithOnlyTwoInstance();
		ClassWithOnlyTwoInstance secondInstance = new ClassWithOnlyTwoInstance();
		ClassWithOnlyTwoInstance thirdInstance = new ClassWithOnlyTwoInstance();
	}
}
