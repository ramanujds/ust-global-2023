package algorithms;

public class CountAnyChar {

	public static void main(String[] args) {
		
		String str="hello world";
		int count=countChar(str, 'o');
		System.out.println("Total count = "+count);
		
	}
	
	
	public static int countChar(String str, char ch) {
		int count=0;
		int length=str.length();
		for(int i=0; i<length;i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}

}
