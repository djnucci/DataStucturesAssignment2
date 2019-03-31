import java.util.ArrayList;

public class GraphNode {
	private int value;
	private ArrayList<Integer> connections;
	
	public GraphNode() {
		connections = new ArrayList<Integer>(0);
	}
	
	public GraphNode(int value, int connection) {
		connections = new ArrayList<Integer>(0);
		this.value = value;
		this.connections.add(connection);
	}
	
	public GraphNode(int value, ArrayList<Integer> connections) {
		this.value = value;
		this.connections = connections;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public ArrayList<Integer> getConnections() {
		return this.connections;
	}
	
	public void setConnections(ArrayList<Integer> connections) {
		this.connections = connections;
	}
	
	public void addConnection(int connection) {
		this.connections.add(connection);
	}
	
	
}
