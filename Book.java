package labass2;

public class Book
{

		private String bookTitle;
		private String author;
		private String ISBN;
		private int numOfCopies;

		public Book1()
		{
		}

		public Book1(String bookTitle, String author, String iSBN, int numOfCopies)
		{
			this.bookTitle = bookTitle;
			this.author = author;
			this.ISBN = iSBN;
			this.numOfCopies = numOfCopies;
		}
		public String getBookTitle()
		{
			return bookTitle;
		}

		public void setBookTitle(String bookTitle) 
		{
                         this.bookTitle = bookTitle;
		}

		public String getAuthor()
		{
			return author;
		}

		public void setAuthor(String author) 
		{
			this.author = author;
		}

		public String getISBN()
		{
			return ISBN;
		}
		public void setISBN(String iSBN) 
		{
                       ISBN = iSBN;
		}

		public int getNumOfCopies()
		{
			return numOfCopies;
		}

		public void setNumOfCopies(int numOfCopies) 
		{
			this.numOfCopies = numOfCopies;
		}

		public void display() 
		{
			System.out.println("The book title is"+bookTitle + ",The author is" + author + ",The ISBN number is" + ISBN + "and the number of copies are" + numOfCopies);
		}
}


