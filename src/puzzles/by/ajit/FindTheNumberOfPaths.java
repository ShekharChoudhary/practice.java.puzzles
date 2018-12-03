package puzzles.by.ajit;

/**
 * find the total number of paths possible.
 * maximum count or loop can be 5
 * in this case following paths are possible
 * A --> B           path 1
 * A --> B --> A --> B  path 2
 * A --> B --> A --> B -->A -->B   path 3 (we cannot exceed more than 5 iterations in a loop)
 * A --> C --> B  path 4
 * 
 * So total output is 4
 * 
 * @author choudshe
 *
 */
public class FindTheNumberOfPaths {

	int countMaxIteration =0;
	int numberOfPaths =0;
	
	public static void main(String[] args) {
		Node currentPosition = new NodeA();
	    FindTheNumberOfPaths path = new FindTheNumberOfPaths();
	    
	    path.getTotalNumberOfPaths(currentPosition);
	}

	private void getTotalNumberOfPaths(Node start) {
		Node nextNode;
		while(countMaxIteration<5) {
			
			
		}
	}
}
