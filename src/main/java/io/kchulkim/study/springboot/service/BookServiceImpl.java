package io.kchulkim.study.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.kchulkim.study.springboot.domain.Book;
import io.kchulkim.study.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;
	
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

}
