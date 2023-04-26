package graph;

public class MainClass {

	public static void main(String[] args) {
		
		AdvancedGraph graph=new AdvancedGraph(5);
		
		graph.addVertex("Rahul");
		graph.addVertex("Rohit");
		graph.addVertex("Mohan");
		graph.addVertex("Priya");
		graph.addVertex("Suraj");
		
		
		graph.addEdge("Rahul", "Rohit");
		graph.addEdge("Rohit", "Priya");
		graph.addEdge("Rahul", "Priya");
		graph.addEdge("Mohan", "Rahul");
		graph.addEdge("Suraj", "Priya");
		graph.addEdge("Priya", "Suraj");
		
		
		graph.printGraph();

	}

}
