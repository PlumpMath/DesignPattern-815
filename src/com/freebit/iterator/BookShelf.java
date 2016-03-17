package com.freebit.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate<Book>{
	
	private int last ;
	private Book [] books ;
	private BookShelfIterator iterator ;
	
	public BookShelf(){
		books = new Book[100];
		last = 0;
		iterator = new BookShelfIterator();
	}
	
	public Book getBookAt(int index){
		return books[index];
	}
	
	public void appendBook(Book book){
		books[last++] = book; 
	}
	
	public int getLength(){return last;}

	@Override
	public Iterator<Book> iterator() {
		return iterator;
	}
	
	private final class BookShelfIterator implements Iterator<Book>{
		
		private int index;
		
		public BookShelfIterator(){
			index = 0;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(0<=index&&index<=last-1){
				return true;
			}else{
				return false;
			}
		}
		
		@Override
		public Book next() {
			if(checkRange()){
				return	getBookAt(index++);
			}			
			return null;
		}
		
		private boolean checkRange(){
			return (0<=index&&index<getLength()) ? true : false; 
		}
	}
	
}
