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

		// cycle through the incoming array and add them all to the graph ArrayList
		for (int i = 0; i < pairs.getNodeSet().size(); i++) {
			boolean hasValue = false;
			int instanceIndex = 0;
			for (int j = 0; j < graph.size(); j++) {
				if (pairs.getNodeSet().get(i).getValue() == graph.get(j).getValue()) {
					hasValue = true;
					instanceIndex = j;
					break;
				}
				else {
					hasValue = false;
				}
			}
			if (hasValue) {
				// if it has the value make a new connection on an existing node
				graph.get(instanceIndex).addConnection(pairs.getNodeSet().get(i).getConnection());
			}
			else {
				// if it doesn't, make a new node in the graph
				graph.add(new GraphNode(pairs.getNodeSet().get(i).getValue(), pairs.getNodeSet().get(i).getConnection()));
			}
		}
	}

	/**
	 * 
	 * @param SearchType type - enum to send to helper methods
	 * @param int        startingNodeValue - the starting nodes value
	 * @param int        endingNodeValue - only used for path search
	 * @return the ordered list of ints
	 */
	public ArrayList<Integer> traverse(SearchType type, int startingNodeValue, int endingNodeValue) {
		switch (type) {
		case DFS:
			return TraverseDFS(startingNodeValue);
		case BFS:
			return TraverseBFS(startingNodeValue);
		case PATH:
			return path(startingNodeValue, endingNodeValue);
		default:
			return null;
		}
	}

	private GraphNode getNodeByValue(int value) {
		for (int i = 0; i < graph.size(); i++) {
			if (graph.get(i).getValue() == value) {
				return graph.get(i);
			}
		}

		return null;
	}

	private ArrayList<Integer> TraverseDFS(int start) {
		GraphNode currNode = getNodeByValue(start);
		ArrayList<Integer> order = new ArrayList<Integer>(0);

		// filler
		for (int i = 0; i < graph.size(); i++) {
			order.add(graph.get(i).getValue());
		}

		return order;
	}

	private ArrayList<Integer> TraverseBFS(int start) {
		GraphNode currNode = getNodeByValue(start);
		ArrayList<Integer> order = new ArrayList<Integer>(0);

		ArrayList<Integer> usedValues = new ArrayList<Integer>(0);

		// filler
		for (int i = 0; i < graph.size(); i++) {
			order.add(graph.get(i).getValue());
		}

		return order;
	}

	private ArrayList<Integer> path(int start, int end) {
		GraphNode nodeOne = getNodeByValue(start);
		GraphNode nodeTwo = getNodeByValue(end);
		ArrayList<Integer> order = new ArrayList<Integer>(0);

		/*
		 * WIP code ArrayList<Integer> usedValues = new ArrayList<Integer>(0);
		 * ArrayList<ArrayList<Integer>> adjacencyGraph = new
		 * ArrayList<ArrayList<Integer>>(0);
		 * 
		 * for (int i = 0; i < graph.size(); i++) { for (int j = 0; j <
		 * graph.get(i).getConnections().size(); j++) {
		 * 
		 * } usedValues.add(graph.get(i).getValue()); }
		 * 
		 * for (int i = 0; i < adjacencyGraph.size(); i++) { if
		 * (adjacencyGraph.get(i).get(0) == start &&
		 * adjacencyGraph.get(i).get(adjacencyGraph.size() - 1) == end) { return
		 * adjacencyGraph.get(i); } }
		 */
		
		// filler
		for (int i = 0; i < graph.size(); i++) {
			order.add(graph.get(i).getValue());
		}

		return order;
	}

}
