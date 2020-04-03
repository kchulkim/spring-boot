package io.kchulkim.study.springboot.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {
	         
	@Autowired
	BookRepository repositry;
	
	@Test
	public void testSave() {
		Book book = new Book();
		book.setName("boot-spring-boot");		
		book.setIsbn10("0123456789");
		book.setIsbn13("0123456789012");
		
		assertThat(book.isNew()).isTrue();
		repositry.save(book);
		assertThat(book.isNew()).isFalse();
	}
	@Test
	public void testFindByNameList() {
		Book book = new Book();
		book.setName("boot-spring-boot");		
		book.setIsbn10("0123456789");
		book.setIsbn13("0123456789012");
		
		repositry.save(book);
		
		List<Book> books = repositry.findByNameLike("boot%");
		assertThat(books).isNotEmpty();

		books = repositry.findByNameLike("book");
		assertThat(books).isEmpty();

	}
	
}
