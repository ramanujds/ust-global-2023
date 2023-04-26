package heap;

public class Heap {

	public Node[] heapArray;

	private int maxSize;

	private int currentSize;

	public Heap(int size) {
		super();
		this.maxSize = size;
		this.heapArray = new Node[maxSize];
		this.currentSize = 0;
	}

	public int getSize() {
		return currentSize;
	}

	public boolean isEmpty() {
		return (currentSize == 0);
	}

	public boolean insert(int key) {
		if (currentSize == maxSize) {
			return false;
		}
		Node newNode = new Node(key);

		heapArray[currentSize] = newNode;
		shiftUp(currentSize);
		currentSize++;
		return true;
	}

	private void shiftUp(int idx) {

		int parentIndex = (idx - 1) / 2;
		Node nodeToInsert = heapArray[idx];
		while (idx > 0 && heapArray[parentIndex].getKey() < nodeToInsert.getKey()) {

			heapArray[idx] = heapArray[parentIndex];
			idx = parentIndex;
			parentIndex = (parentIndex - 1) / 2;

		}
		heapArray[idx] = nodeToInsert;

	}

	public Node remove() {
		Node root = heapArray[0];
		currentSize--;
		heapArray[0] = heapArray[currentSize];

		shiftDown(0);
		return root;
	}

	private void shiftDown(int idx) {

		int largerChildIndex;
		Node root = heapArray[idx];

		while (idx < currentSize / 2) {
			int leftChildIndex = 2 * idx + 1;
			int rightChildIndex = leftChildIndex + 1;
			if (rightChildIndex < currentSize
					&& heapArray[leftChildIndex].getKey() < heapArray[rightChildIndex].getKey()) {
				largerChildIndex = rightChildIndex;
			} else {
				largerChildIndex = leftChildIndex;
			}
			if (root.getKey() >= heapArray[largerChildIndex].getKey()) {
				break;
			}
			heapArray[idx] = heapArray[largerChildIndex];
			idx = largerChildIndex;
		}
		heapArray[idx] = root;

	}

	public void displayHeap() {

		for (int i=0;i<currentSize; i++) {
			System.out.print(heapArray[i].getKey() + "   ");
		}

	}
}
