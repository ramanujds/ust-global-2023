package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private int vCount;
	private int eCount;
	
	private List[] adjacents; //array of list
	
	public Graph(int vCount) {
		this.vCount=vCount;
		
		this.eCount=0;
		
		adjacents=new List[vCount];
		
		for(int i=0;i<vCount;i++) {
			adjacents[i]=new ArrayList();
		}
	}
	
	public int getVertexCount() {
		return this.vCount;
	}
	public int getEdgeCount() {
		return this.eCount;
	}
	
	public void addEdge(int src, int dest) {
		adjacents[src].add(dest);
		eCount++;
	}
	
	public List getAdj(int src) {
		return adjacents[src];
	}
}
