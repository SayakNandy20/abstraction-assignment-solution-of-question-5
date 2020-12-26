package parentchildabs5;

public abstract class book {
	protected int ISBNNumber;
	protected String bookName;
	protected double Price;
	public book(int iSBNNumber, String bookName, double price) {
		ISBNNumber = iSBNNumber;
		this.bookName = bookName;
		Price = price;
	}
	public int getISBNNumber() {
		return ISBNNumber;
	}
	public void setISBNNumber(int iSBNNumber) {
		ISBNNumber = iSBNNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	abstract public float calculateDiscount();
	
	

}
