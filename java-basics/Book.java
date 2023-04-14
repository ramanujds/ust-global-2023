class Book {
    int isbnNo;
    String bookName;
    String author;
    String genre;
    float price;

    // Declare required constructors
	
	public Book(int isbnNo, String bookName, String author, String genre, 										float price){
		this.isbnNo=isbnNo;
    		this.bookName=bookName;
   	 	this.author=author;
    		this.genre=genre;
    		this.price=price;
	}

    // create a method to print book details

	public void printBookDetails(){
		System.out.println("Book Details : ");
		System.out.println("ISBN : "+isbnNo);
		System.out.println("Name : "+bookName);
		System.out.println("Author : "+author);
		System.out.println("Genre : "+genre);
		System.out.println("Price : "+price);
	}
		

}
