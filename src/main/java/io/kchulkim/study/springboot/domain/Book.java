package io.kchulkim.study.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book extends AbstractPersistable<Long> {

	private String name;
	private String isbn13;
	private String isbn10;
	
	
	
}
