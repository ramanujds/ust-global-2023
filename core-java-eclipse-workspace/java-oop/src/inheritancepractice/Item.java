package inheritancepractice;

public class Item {
	private long id;
	private String title;
	private int noOfCopies;
	
	public Item() {
	}
	
	public Item(long id, String title, int noOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	// print, checkIn, checkOut, addItem
	
	public void print() {
		System.out.println("....");
	}
	
	
	
	
}
