package com.springRest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.springRest.Dao.BookDao;
import com.springRest.entities.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {
	
	@Autowired
	private BookDao bookdao;
	
//	static List<Book> list = new ArrayList<>();
//	
//	static {
//		list.add(new Book(100, "shu", "bham"));
//		list.add(new Book(101, "sag", "ar"));
//		list.add(new Book(102, "naz", "im"));
//	}
	
	public List<Book> getAllBooks(){
		List<Book> list = (List<Book>)bookdao.findAll();
		return list;
	}
	
	public Optional<Book> getBookById(int id) {
		Optional<Book> book=null;
		try {
//			book = list.stream().filter(b->b.getBookId()==id).findFirst().get();
			book = bookdao.findById(id);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No book found");
		}
		return book;
	}
	
	public Book addBook(Book book) {
		//list.add(book);
		bookdao.save(book);
		return book;
	}
	
	public Book updateBook(Book book,int id) {
//		Book b1 = list.stream().filter(b->b.getBookId()==id).findFirst().get();
//		b1.setBookName(book.getBookName());
//		b1.setBookAuthor(book.getBookAuthor());
		book.setBookId(id);
		bookdao.save(book);
		return book;
	}
	
	public void deleteBookById(int id) {
//		Book book = list.stream().filter(b->b.getBookId()==id).findFirst().get();
//		list.remove(book);
		bookdao.deleteById(id);
	}

}
