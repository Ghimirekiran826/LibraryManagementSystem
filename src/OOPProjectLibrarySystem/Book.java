package OOPProjectLibrarySystem;

public class Book {
	//defining static variable
	static String title;
	static String author;
	static int ISBN;
	static boolean available;
	
	//defining constructor
	
	public Book(String title,String author, int ISBN)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.available = false;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public int getISBN()
	{
		return ISBN;
	}
	public boolean isAvailable()
	{
		return false;
	}
	public void setAvailable(boolean available)
	{
		this.available = available;
	}
}
