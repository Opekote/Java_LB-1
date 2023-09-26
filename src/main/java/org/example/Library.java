package org.example;

import java.util.ArrayList;
import java.util.List;


public class Library {

    private List<Book> library = new ArrayList<>();

    public List<Book> getLibrary() {
        return library;
    }

    public void addBook(Book book){
        library.add(book);
    }

    public void showAllBooks(){
        for (Book book: library) {
            System.out.println(book);
        }
    }

    public Book findBookViaName(String name) {
        Book foundBook = library.stream()
                .filter(book -> book.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No a such book with name ->" + name));

        return foundBook;


    }

    public void removeBook(String ISBN) throws IllegalArgumentException {


        if (library.removeIf(book -> book.getISBN().equals(ISBN))) {
            System.out.println("Book removed");
        } else {
            throw new IllegalArgumentException("Can't remove.No a such book");
        }
    }


}
