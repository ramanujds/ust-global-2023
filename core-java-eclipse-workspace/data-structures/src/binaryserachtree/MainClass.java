package binaryserachtree;

public class MainClass {

	public static void main(String[] args) {
		
		BinarySearchTree bst=new BinarySearchTree();
		
		bst.insert(20, "Twenty");
		bst.insert(10, "Ten");
		bst.insert(25, "Twenty Five");
		bst.insert(40, "Forty");
		
		//bst.displayTree();
		
		System.out.println("Min = "+bst.findMin());
		
		System.out.println("Max = "+bst.findMax());
		
		

	}

}
