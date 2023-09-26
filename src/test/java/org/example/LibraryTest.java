package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testAddBook() {
        //Check of add Method via assertTrue.Creating book, trying to add and ensure that list contains our book.
        Book book = Book.createBook("The Catcher in the Rye", "J.D. Salinger", "9780316769174", 1951);
        library.addBook(book);

        assertTrue(library.getLibrary().contains(book));
    }

    @Test
    void testFindBookViaName() {
        //Check of findBookViaName method.Adding book and then compare results
        Book book1 = Book.createBook("To Kill a Mockingbird", "Harper Lee", "9780061120084", 1960);
        Book book2 = Book.createBook("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925);

        library.addBook(book1);
        library.addBook(book2);

        Book foundBook = library.findBookViaName("To Kill a Mockingbird");
        assertEquals(book1, foundBook);
    }

    @Test
    void testFindBookViaNameNotFound() {
        //Check of findBookViaName method.Adding book and then compare results.If book was not found method returns "No a such Book".
        assertThrows(IllegalArgumentException.class, () -> {
            library.findBookViaName("Non-existent Book");
        });
    }

    @Test
    void testRemoveBook() {
        //Remove book from library via removeBook, check what this method returns and ensure that library no more contains this book
        Book book1 = Book.createBook("1984", "George Orwell", "9780451524935", 1949);
        library.addBook(book1);

        library.removeBook("9780451524935");
        assertFalse(library.getLibrary().contains(book1));
    }

    @Test

    void testRemoveBookNotFound() {
        // Checking if method returns exception if no a such book
        assertThrows(IllegalArgumentException.class, () -> {
            library.removeBook("Non-existent ISBN");
        });
    }
}
