package OOPProjectLibrarySystem;

public class Transaction {
	Book book;
	User user;
	String borroweddate;
	String duedate;
	
	public Transaction(Book book,User user,String borroweddate,String duedate)
	{
		this.book = book;
		this.user = user;
		this.borroweddate = borroweddate;
		this.duedate = duedate;
	}
	Book getBook()
	{
		return book;
	}
	User getUser()
	{
		return user;
	}
	String getBorroweddate()
	{
		return borroweddate;
	}
	String getDuedate()
	{
		return duedate;
	}
}
