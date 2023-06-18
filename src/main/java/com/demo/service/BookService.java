package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Book;

@Service
public interface BookService {
	
	public String upsertBook(Book book);
	
	
	public List<Book> getAllBook();
	

	public String deleteBook(Integer bookId);

}
