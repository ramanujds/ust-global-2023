package binaryserachtree;

public class Node {
	
	int key;
	String value;
	
	Node leftChild, rightChild;

	public Node(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + "]";
	}
	
	

}
