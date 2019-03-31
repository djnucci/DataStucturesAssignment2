import java.util.ArrayList;

public class NodePairSet {
	private ArrayList<NodePair> input;

	public NodePairSet() {
		input = new ArrayList<NodePair>(0);
	}
	
	public NodePairSet(String input) {
		this.input = new ArrayList<NodePair>(0);
		
		String[] inputLines = input.split("\n");
		
		for (int i = 0; i < inputLines.length; i++) {
			String[] splitInputLines = inputLines[i].split(" ");
			int[] temp = {Integer.parseInt(splitInputLines[0]), Integer.parseInt(splitInputLines[1])};
			addNode(temp);
		}
	}
	
	public ArrayList<NodePair> getNodeSet() {
		return input;
	}

	public void setNodeSet(ArrayList<NodePair> input) {
		this.input = input;
	}
	
	public void addNode(int[] pair) {
		this.input.add(new NodePair(pair[0], pair[1]));
	}
}
