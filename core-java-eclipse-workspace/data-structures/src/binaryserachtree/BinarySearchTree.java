package binaryserachtree;



public class BinarySearchTree {
	
	private Node root;
	
	
	public void insert(int key, String value) {
		
		Node newNode=new Node(key,value);
		
		if(root==null) {
			root=newNode;
		}
		else {
			
			Node current=root;
			Node parent;
			
			while(true) {
				parent=current;
				if(key<current.key) {
					current=current.leftChild;
					if(current==null) {
						parent.leftChild=newNode;
						return;
					}
				}
				else {
					current=current.rightChild;
					if(current==null) {
						parent.rightChild=newNode;
						return;
					}
				}
			}
			
		}
		
		
	}
	
	public void displayTree() {
	
		// 	Code to be written later on
		
	}
	
	public Node findMin() {
		Node current=root;
		Node min=null;
		while(current!=null) {
			min=current;
			current=current.leftChild;
		}
		return min;
	}
	
	public Node findMax() {
		Node current=root;
		Node max=null;
		while(current!=null) {
			max=current;
			current=current.rightChild;
		}
		return max;
	}
	
	public boolean remove(int key) {
		Node currentNode=root;
		Node parentNode=root;
		boolean isLeftChild=false;
		
		while(currentNode.key!=key) {
			parentNode=currentNode;
			if(key<currentNode.key) {
				isLeftChild=true;
				currentNode=currentNode.leftChild;
			}
			else {
				currentNode=currentNode.rightChild;
				isLeftChild=false;
			}
			if(currentNode==null) {
				return false;
			}
		}
		
		Node nodeToDelete=currentNode;
		
		// If the node is a leaf node
		
		if(nodeToDelete.leftChild==null && nodeToDelete.rightChild==null) {
			if(nodeToDelete==root) {
				root=null;
			}
			else if(isLeftChild) {
				parentNode.leftChild=null;
			}
			else {
				parentNode.rightChild=null;
			}
		}
		
		// If the node has one child (left)
		else if(nodeToDelete.rightChild==null) {
			if(nodeToDelete==root) {
				root=nodeToDelete.leftChild;
			}
			else if(isLeftChild) {
				parentNode.leftChild=nodeToDelete.leftChild;
			}
			else {
				parentNode.rightChild=nodeToDelete.leftChild;
			}
		}
		
		
		// If the node has one child (right)
		else if(nodeToDelete.leftChild==null) {
			if(nodeToDelete==root) {
				root=nodeToDelete.rightChild;
			}
			else if(isLeftChild) {
				parentNode.leftChild=nodeToDelete.rightChild;
			}
			else {
				parentNode.rightChild=nodeToDelete.rightChild;
			}
		}
		
		// If Node has 2 Children
		else {
			
			Node successor=getSuccessor(nodeToDelete);
			
			if(nodeToDelete==root) {
				root=successor;
			}
			else if(isLeftChild) {
				parentNode.leftChild=successor;
			}
			else {
				parentNode.rightChild=successor;
			}
			successor.leftChild=nodeToDelete.leftChild;
			
		}
		
		return true;
		
	}
	
	private Node getSuccessor(Node nodeToDelete) {
		Node successorParent=nodeToDelete;
		Node successor=nodeToDelete;
		
		Node current=nodeToDelete.rightChild;
		
		while(current!= null) {
			successorParent=successor;
			successor=current;
			current=current.leftChild;
		}
		
		// if successor not a right child
		if(successor !=nodeToDelete.rightChild) {
			successorParent.leftChild=successor.rightChild;
			successor.rightChild=nodeToDelete.rightChild;
		}
		return successor;
		
	}

}
