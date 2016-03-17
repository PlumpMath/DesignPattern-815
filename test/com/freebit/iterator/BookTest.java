package com.freebit.iterator;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BookTest {

	@Test
	public void test() {
		Book book = new Book("Bible");
		assertEquals("Bible",book.getName());
	}

}
