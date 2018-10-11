package barclays.programs;

import java.util.HashMap;

public class BarclaysFirstProgram {

	static final HashMap<Character, Integer> hierarchy = new HashMap<>();
	public static void main(String[] args) {
		String alec = "23A84Q";
		String bob = "K2Q25J";
		BarclaysFirstProgram prog = new BarclaysFirstProgram();
		hierarchy.put('2', 1);
		hierarchy.put('3', 2);
		hierarchy.put('4', 3);
		hierarchy.put('5', 4);
		hierarchy.put('6', 5);
		hierarchy.put('7', 6);
		hierarchy.put('8', 7);
		hierarchy.put('9', 8);
		hierarchy.put('T', 9);
		hierarchy.put('J', 10);
		hierarchy.put('Q', 11);
		hierarchy.put('K', 12);
		hierarchy.put('A', 13);
		System.out.println(prog.getcountofAlec(alec,bob));
	}

	private int getcountofAlec(String alec, String bob) {

		int counter =0;
		char [] alecCard = alec.toCharArray();
		char [] bobCard = bob.toCharArray();
		
		for(int i =0;i<alecCard.length;i++) {
			if(hierarchy.get(alecCard[i])>hierarchy.get(bobCard[i])) {
				counter ++;
			}
		}
		
		
		return counter;
	}
}
