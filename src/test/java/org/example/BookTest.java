package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    void testCreateValidBook() {
        // Creation of valid book and check of getters.
        Book book = Book.createBook("Adventures Of Tom Sawyer", "Mark Twain", "9780195810400", 1978);
        assertNotNull(book);
        assertEquals("Adventures Of Tom Sawyer", book.getName());
        assertEquals("Mark Twain", book.getAuthor());
        assertEquals("9780195810400", book.getISBN());
        assertEquals(1978, book.getYearOfEdition());
    }

    @Test
    void testCreateBookWithInvalidISBN() {
        // Trying to create book with invalid ISBN.And ensure we get null
        assertNull(Book.createBook("Invalid Book", "Invalid Author", "12345", 2023));
    }

    @Test
    void testCreateBookWithInvalidYear() {
        // Trying to create book with invalid year.And ensure we get null
        assertNull(Book.createBook("Invalid Book", "Invalid Author", "9780195810400", 1000));
    }
}

