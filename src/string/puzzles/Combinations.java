package string.puzzles;

import java.util.HashSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Combinations {
	public static HashSet<String> inputSet = new HashSet<>();
	private StringBuilder output = new StringBuilder();
	private final String inputstring;

	public Combinations(final String str) {
		inputstring = str;
		inputSet.add(inputstring);
		System.out.println("The input string  is  : " + inputstring);
	}

	public static void main(String args[]) {
		Combinations combobj = new Combinations("lsdkaspsdpsdlwe");
		System.out.println("");
		System.out.println("");
		System.out.println("All possible combinations are :  ");
		System.out.println("");
		System.out.println("");
		combobj.combine();
		System.out.println("*********");
		if(inputSet.contains("apple")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	public void combine() {
		combine(0);
	}

	private void combine(int start) {
		for (int i = start; i < inputstring.length(); ++i) {
			output.append(inputstring.charAt(i));
			System.out.println(output);
			if (i < inputstring.length())
				combine(i + 1);
			output.setLength(output.length() - 1);
		}
	}
}