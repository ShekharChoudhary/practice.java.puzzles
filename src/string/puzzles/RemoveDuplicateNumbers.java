package string.puzzles;

public class RemoveDuplicateNumbers {
	Node root = null;

	public static void main(String[] args) {

		int[] numbers = {1,1,2,2,3,3,4,4,5,5,6,1,1,1,1,1,7};
		RemoveDuplicateNumbers number = new RemoveDuplicateNumbers();
		for (int i : numbers) {
			number.setValue(i);
		}

	}

	public void setValue(int number) {
		Node temp = new Node();
		Node forIteration;
		boolean flag = false;
		forIteration = root;
		Node previous = null;

		if (root == null) {
			System.out.println(number);
			temp.value = number;
			root = temp;
			temp = null;
		} else {
            
			if(root.next==null){
				flag=true;
			}
			
			while (forIteration != null) {
				if (forIteration.value == number) {
					flag = false;
					break;
				} else {
					flag = true;
					previous = forIteration;
					forIteration = forIteration.next;
				}
			}
			if (flag) {
				System.out.println(number);
				temp.value = number;
				previous.next = temp;
			}
		}
	}

	class Node {
		int value;
		Node next;
	}
}
