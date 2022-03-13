package Assignment2;

class Book{
	private String bookTitle;
	private String Author;
	private String ISBN;
	private int quantity;
	public String getBookTitle() {
		return bookTitle;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book(String bookTitle, String auther, String iSBN, int quantity) {
		this.bookTitle = bookTitle;
		this.Author = auther;
		this.ISBN = iSBN;
		this.quantity = quantity;
	}
	public void display() {
		System.out.println("---book details------");
		System.out.println("bookTitle: " + bookTitle);
		System.out.println("author: " + Author);
		System.out.println("isbn: " + ISBN);
		System.out.println("numOfCopies: " + quantity);
		System.out.println("---------------------");

	}
	
}
public class questuion2 {
	public static void main(String[] args) {
		Book Book=new Book("wingsofFire","AbdulKalam","AEF34",11);
//		bookStore.sell("ikigai",3);
		Book.display();
	}

}
