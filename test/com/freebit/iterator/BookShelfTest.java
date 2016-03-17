package com.freebit.iterator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class BookShelfTest {

	private final Book[] books = {
			new Book("Around the World in 80 Days!"),
			new Book("Bible"),
			new Book("Cinderella"),
			new Book("Daddy-Long-Legs")
	};
	
	private BookShelf bookShelf ;
	private Iterator<Book> iterator ;
	
	
	@Before
	public void setUp() throws Exception{
		bookShelf = new BookShelf();
		iterator = bookShelf.iterator();
		for(Book book:books) bookShelf.appendBook(book);
	}
		
	@Test
	public void testLength() {
		assertEquals(4,bookShelf.getLength());
	}
	
	@Test
	public void testGetBook() throws Exception{
		assertEquals(books[0],bookShelf.getBookAt(0));
		assertEquals(books[1],bookShelf.getBookAt(1));
		assertEquals(books[2],bookShelf.getBookAt(2));
		assertEquals(books[3],bookShelf.getBookAt(3));
	}
	
	@Test
	public void testIterator() throws Exception{
		//1回目取り出し
		assertEquals(books[0],iterator.next());
		assertEquals(true,iterator.hasNext()); 
		//2回目取り出し
		assertEquals(books[1],iterator.next());
		assertEquals(true,iterator.hasNext()); 
		//3回目取り出し
		assertEquals(books[2],iterator.next());
		assertEquals(true,iterator.hasNext()); 
		//4回目取り出し
		assertEquals(books[3],iterator.next());
		assertEquals(false,iterator.hasNext());
	}
}
