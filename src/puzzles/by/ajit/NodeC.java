package puzzles.by.ajit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NodeC implements Node{

	public Set<Node> outgoingNodes = new HashSet<>();
	
	@Override
	public Set<Node> getNextNode() {
		return outgoingNodes;
	}

	@Override
	public void addNode() {
		outgoingNodes.add(new NodeB());
		
	}

}
