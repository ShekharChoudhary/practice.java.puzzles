package string.puzzles;

import java.util.ArrayList;
/*
 * COMPLETE THIS PUZZLE
 */
public class StringOfNonRepeatingCharacters {

	Node root = new Node();
	public static void main(String[] args) {
		StringOfNonRepeatingCharacters str = new StringOfNonRepeatingCharacters();
		String input = "aabbcdac";
		str.arrangeString(input);
	}

	private  void arrangeString(String input) {

		char [] value = input.toCharArray();
		int counter =0;
		ArrayList<Character> list = new ArrayList<>();
		root.input = value[0];
		Node current = root;
		for(int i =1;i<value.length;i++) {
		 	if(current.input == value[i]) {
		 		list.add(value[i]);
		 		counter++;
		 	}else {
		 		Node temp = new Node();
		 		temp.input = value[i];
		 		current.next = temp;
		 		current = current.next;
		 	}
		 	
		}
		boolean flag = false;
		if(list.size()>0) {
			current = root;			
			for (Character ch : list) {
				if(current.input == ch) {
					current = current.next;
					if(current == null) {
						flag = true;
					}
				}else {
					Node temp1 = new Node();
					temp1.input = ch;
					temp1.next = current.next;
					current = temp1;
				}
			}
		}
		
		if(flag) {
			System.out.println("The string is incorrect");
		}else {
			current = root;
			while(current != null) {
				System.out.print(current.input);
				current = current.next;
			}
		}
	}
	
	class Node {
		char input;
		Node next;
	}
	
}
