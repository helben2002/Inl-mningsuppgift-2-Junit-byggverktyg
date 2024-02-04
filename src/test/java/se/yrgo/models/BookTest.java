package se.yrgo.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		var book1 = new Book(7, "Title","Author","123456","Roman",788);
		var book2 = new Book(7, "Title","Author","123456","Roman",788);
		assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		var book1 = new Book(9, "Title","Author","123456","Roman",788);
		var book2 = new Book(7, "Title","Author","123456","Roman",788);
		assertNotEquals(book1, book2);
	}

}
