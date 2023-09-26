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
        // Trying to create book with invalid ISBN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
            Book.createBook("Invalid Book", "Invalid Author", "12345", 2023)
        );

        assertEquals("Wrong ISBN. ISBN can consist only of 10 or 13 digits", exception.getMessage());
    }

    @Test
    void testCreateBookWithInvalidYear() {
        // Trying to create book with invalid year
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                Book.createBook("Invalid Book", "Invalid Author", "9780195810400", 1000)
        );

        assertEquals("Wrong year. Printing of books started at 1445 A.D", exception.getMessage());
    }
}

