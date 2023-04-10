import java.util.Scanner;
class StringArray{
   public static void main(String []args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = scan.nextInt();
	String []names = new String[size];
       System.out.println("Enter "+size+" names");
	for(int id=0; id<size; id++){
	   names[id] = scan.next() + scan.nextLine();	
	}

	for(var name : names){
		System.out.println(name);
	}
  }
}
