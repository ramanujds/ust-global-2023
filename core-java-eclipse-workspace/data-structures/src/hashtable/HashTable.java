package hashtable;

public class HashTable {

	int []arr;
	int capacity;
	
	public HashTable(int capacity) {
		this.capacity=capacity;
		arr=new int[this.capacity];
		
	}
	
	public int hashFun(int item) {
		return item%capacity;
	}
	
	public void insert(int item) {
		int index=hashFun(item);
		arr[index]=item;
	}
	
	public int getNextPrime(int capacity) {
		if(capacity%2==0) {
			capacity++;
		}
		for(int i=1; isPrime(capacity); ) {
			capacity=capacity+(i*i);
		}
		
		return capacity;
	}
	
	public boolean isPrime(int num) {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public void delete(int item) {
		int index=hashFun(item);
		arr[index]=0;
	}
	
	
	public void printHashTable() {
		for(int item:arr) {
			System.out.println(item);
		}
	}
}
