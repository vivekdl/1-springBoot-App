package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.entity.Book;
import com.demo.repo.BookRepository;

@Component
public class BookServiceIImpl implements BookService {

	@Autowired
	private BookRepository repository;
	

	@Override
	public String upsertBook(Book book) {
		
		
		Book save=repository.save(book);
		
		if(book.getBookID()==null) {
			return "Record Inserted";
		}else {
			return "Record Updated";
		}
		
	}

	@Override
	public List<Book> getAllBook() {
		return  repository.findAll();
		
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return null;
	}

	

}
