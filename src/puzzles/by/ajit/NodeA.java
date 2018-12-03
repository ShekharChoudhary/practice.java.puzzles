package puzzles.by.ajit;

import java.util.HashSet;
import java.util.Set;

public class NodeA implements Node {
	
	public Set<Node> outgoingNodes = new HashSet<>();

	@Override
	public Set<Node> getNextNode() {
		return outgoingNodes;
	}

	@Override
	public void addNode() {
		outgoingNodes.add(new NodeB());
		outgoingNodes.add(new NodeC());
	}
	
	

}
