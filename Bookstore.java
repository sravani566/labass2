package labass2;

import labass2.Book;

public class BookStore extends Book 
{
	
	Book books[] = {new Book("Happy Life", "Wesily", "3485", 19),new Book("Apple ", "Samantha", "89656", 14) };

	public void sell(String bookTitle, int noOfCopies) 
        {
		boolean b = false;
		for (int i = 0; i < books.length; i++)
                {
			if ((books[i].getBookTitle() == bookTitle) && noOfCopies <= books[i].getNumOfCopies()) 
                        {
				b = true;
				int copies = books[i].getNumOfCopies() - noOfCopies;
				books[i].setNumOfCopies(copies);
			}
		}
		if (b == false)
			System.out.println("Sorry...Book has not found");
	}

	public void order(String isbn, int noOfCopies) 
        {
		boolean b = false;
		for (int i = 0; i < books.length; i++) 
                {
			if (books[i].getISBN() == isbn)
                        {
				b = true;
				int copies = books[i].getNumOfCopies() + noOfCopies;
				books[i].setNumOfCopies(copies);
                          }
		}
		if (b == false)
			System.out.println("Sorry...Book has not found");
	}

	public void order(String isbn, int noOfCopies)
        {
		boolean b = false;
		for (int i = 0; i < books.length; i++) 
                {
			if (books[i].getISBN() == isbn) 
                        {
				b = true;
				int copies = books[i].getNumOfCopies() + noOfCopies;
				books[i].setNumOfCopies(copies);
			}
		}
		if (b == false) 
                {
			System.out.println("A New book has added!");
		}
	}

	public void display()
        {
		for (int i = 0; i < books.length; i++)
                {
                      books[i].display();
		}
	}

}
