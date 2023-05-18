import java.util.*;

class StringSorting{
public static void main(String []args){
	
	List<String> items = new
			 ArrayList(List.of("Gaurav","Suraj","Raj","Bob","Karan"));

	Collections.sort(items,(s1,s2)->s2.compareTo(s1));
	System.out.println(items);

	List<Integer> numbers = new
			 ArrayList(List.of(10,22,3,65,27));
	
	Collections.sort(numbers,(s1,s2)->s2-s1);
	System.out.println(numbers);

	Comparator<String> comp = (s1,s2)->{
						if(s1.length()==s2.length()){
							return s1.compareTo(s2);
						}
						else return s1.length()-s2.length();
					};

	Collections.sort(items,comp);
	System.out.println(items);

  }

}