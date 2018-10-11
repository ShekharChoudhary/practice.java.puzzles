package LinkedList.puzzles;

/**
 * Find the intersection of two linked list.
 * This is the first approach. In this approach we find the length of both the linked list 
 * then substract the lenghts diff = l1-l2
 * then start compairing the values of list again. comparison of smaller list should start from the
 * first value but comparison of the second list should start from the diff.
 * @author choudshe
 *
 */
public class TomTomVorYShapedLinkedList1 {

	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	
	public  int getCommonPoint() {
		int finalValue =0;
		Node l1 = new Node(10);
		l1.next = new Node(20);
		l1.next.next = new Node(30);
		Node joint = new Node(40);
		l1.next.next.next = joint;
		joint.next=new Node(50);
		joint.next.next = new Node(60);
		
		Node l2 = new Node(11);
		l2.next = new Node(21);
		l2.next.next = joint;
		
		
		System.out.print("  length of first list : ");
		Node firstList = l1;
		int countFirstList =0;
		while(firstList != null) {
			countFirstList++;
			firstList = firstList.next;
			
		}
		System.out.print(countFirstList);
		
		
		System.out.print(" length of second list : ");
		Node secondList = l2;
		int countSecondList =0;
		while(secondList != null) {
			countSecondList ++;
			secondList = secondList.next;
		}
		
		System.out.print(countSecondList);
		
		int startCounter =0;
		firstList = l1;
		secondList = l2;
		if(countFirstList > countSecondList) {
			startCounter = countFirstList - countSecondList;
			int count =0;
			while(count <startCounter) {
				firstList = firstList.next;
				count ++;
			}
		}else {
			startCounter = countSecondList - countFirstList;
			int count =0;
			while(count <=startCounter) {
				secondList = secondList.next;
				count ++;
			}
		}
		
     while(firstList !=null) {
    	 if(firstList.value == secondList.value) {
    		 finalValue = firstList.value;
    		 break;
    	 }else {
    		 firstList = firstList.next;
    		 secondList = secondList.next;
    	 }
    	 
     }
		
		return finalValue;
	}
	
	public static void main(String[] args) {
		TomTomVorYShapedLinkedList1 list = new TomTomVorYShapedLinkedList1();
		int commonPoint = list.getCommonPoint();
		System.out.println();
		System.out.println("Common value");
		System.out.println(commonPoint);
		
		}
}
