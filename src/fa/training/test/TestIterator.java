package fa.training.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		Book book1 = new Book(1, "A");
		Book book2 = new Book(1, "B");
		Book book3 = new Book(1, "C");
		Book book4 = new Book(1, "D");
		Book book5 = new Book(1, "E");
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		System.out.println(books);
		
		Iterator<Book> iteBooks = books.iterator();
		while (iteBooks.hasNext()) {
			Book e = iteBooks.next();
			if (e.getName().equals("A")) {
				iteBooks.remove();
				break;
			}
			
		}
		
		while (iteBooks.hasNext()) {
			Book e = iteBooks.next();
			System.out.println(e);
			
		}
	}
}
