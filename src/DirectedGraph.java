import java.util.ArrayList;

public class DirectedGraph {

	ArrayList<GraphNode> graph;
	
	public DirectedGraph() {
		graph = new ArrayList<GraphNode>(0);
	}
	
	public DirectedGraph(NodePairSet pairs) {
		graph = new ArrayList<GraphNode>(0);
		
		if (pairs.getNodeSet().size() > 0) {
			graph.add(new GraphNode(pairs.getNodeSet().get(0).getValue(), pairs.getNodeSet().get(0).getConnection()));
		}
		
		//cycle through the incoming array and add them all to the graph ArrayList
		for (int i = 0; i < pairs.getNodeSet().size(); i++) {
			boolean hasValue = false;
			int instanceIndex = 0;
			for (int j = 0; j < graph.size(); j++) {
				if (pairs.getNodeSet().get(i).getValue() == graph.get(j).getValue()) {
					hasValue = true;
					instanceIndex = j;
					break;
				} else {
					hasValue = false;
				}
			}
			if (hasValue) {
				//if it has the value make a new connection on an existing node
				graph.get(instanceIndex).addConnection(pairs.getNodeSet().get(i).getConnection());
			}
			else {
				graph.add(new GraphNode(pairs.getNodeSet().get(i).getValue(), pairs.getNodeSet().get(i).getConnection()));
			}
		}
	}
}
