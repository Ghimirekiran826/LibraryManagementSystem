package OOPProjectLibrarySystem;
import java.util.List;
import java.util.ArrayList;
public class Library {
	List<Book> books;
	List<User> users;
	List<Transaction> transactions;
	
	public Library()
	{
		this.books = new ArrayList<>();
		this.users = new ArrayList<>();
		this.transactions = new ArrayList<>();
	}
	public void addbooks(Book book)
	{
		books.add(book);
	}
	public void registeruser(User user)
	{
		users.add(user);
	}
	public void borrowedbook()
	{
		//need to think logic
	}
	public void returnedbook()
	{
		//need to think logic
	}
}
