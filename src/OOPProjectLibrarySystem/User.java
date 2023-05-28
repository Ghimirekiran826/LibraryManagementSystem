package OOPProjectLibrarySystem;
import java.util.List;
import java.util.ArrayList;
public class User {
	static String name;
	static String email;
	static List<Book> borrowedbooks ;
	
	public User(String name, String email)
	{
		this.name = name;
		this.email = email;
		this.borrowedbooks = new ArrayList<>();
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public List<Book> getBorrowedbooks()
	{
		return borrowedbooks;
	}
}
