package hashtable;

public class MainClass {
	
	public static void main(String[] args) {
		HashTable hashTable=new HashTable(20);
		hashTable.insert(25);
		hashTable.insert(28);
		hashTable.insert(20);
		hashTable.insert(10);
		hashTable.insert(15);
		System.out.println("After Inserting");
		hashTable.printHashTable();
		
		hashTable.delete(25);
		System.out.println("After Deleteing");
		hashTable.printHashTable();
		
	}

	
	
	
}
