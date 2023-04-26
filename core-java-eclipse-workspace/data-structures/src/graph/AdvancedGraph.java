package graph;

public class AdvancedGraph {

	class Node{
		int vertexId;
		Node next;
		public Node(int vertexId, Node node) {
			super();
			this.vertexId = vertexId;
			this.next = node;
		}
		
	}
	
	class Vertex{
		String name;
		Node ajList;
		public Vertex(String name, Node ajList) {
			super();
			this.name = name;
			this.ajList = ajList;
		}
		
	}
	
	Vertex[] arrayOfList;
	int indexCount=0;
	
	public AdvancedGraph(int vCount) {
		arrayOfList=new Vertex[vCount];
	}
	
	public void addVertex(String vertexName) {
		arrayOfList[indexCount]=new Vertex(vertexName, null);
		indexCount++;
	}
	
	public void addEdge(String src, String dest) {
		int srcIndex=findIndex(src);
		int destIndex=findIndex(dest);
		arrayOfList[srcIndex].ajList=new Node(destIndex, arrayOfList[srcIndex].ajList);
		
	}
	
	int findIndex(String name) {
		for(int v=0; v<arrayOfList.length; v++) {
			if(arrayOfList[v].name.equalsIgnoreCase(name)) {
				return v;
			}
		}
		return -1;
	}
	
	public void printGraph() {
		System.out.println();
		for(int v=0;v<arrayOfList.length;v++) {
			System.out.println(arrayOfList[v].name);
			for(Node node = arrayOfList[v].ajList; node!=null; node=node.next) {
				System.out.println(" ---> "+arrayOfList[node.vertexId].name);
			}
			System.out.println("\n");
		}
	}
	
}
