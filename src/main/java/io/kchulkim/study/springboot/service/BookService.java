package io.kchulkim.study.springboot.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import io.kchulkim.study.springboot.domain.Book;

public interface BookService {

	Optional<Book> findById(Long id);
	
	
}
