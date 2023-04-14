public class BookStoreImpl {
   
	public static Book findCheapestBook(Book b1, Book b2, Book b3){
		
		Book cheapestBook;
		if(b1.price<b2.price){
			cheapestBook = b1;
		}
		else{
			cheapestBook = b2;
		}
		
		if(b3.price<cheapestBook.price){
			cheapestBook=b3;
		}
		return cheapestBook;
			
	}

	public static void main(String[] args) {
    
        Book b1=new Book(100001,"Theory of Evolution","Charls Darwin","Science",550.0F);
        Book b2=new Book(700002,"Alchemist","Paul Clocoelha","Science",450.0F);
	Book b3=new Book(7203221,"Brief History of Humankind","Norah","History",750.0F);

	
	b1.printBookDetails();
	b2.printBookDetails();
	b3.printBookDetails();

	System.out.println("Cheapest Book is : ");

	Book cheapestBook = findCheapestBook(b1,b2,b3);

	cheapestBook.printBookDetails();
	
    }

}
