package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Library {

    List<Book> library = new ArrayList<>();


    public void addBook(Book book){
        library.add(book);
    }

    public void showAllBooks(){
        for (Book book: library) {
            System.out.println(book);
        }
    }

    public void findBookViaName(String name) {
        Optional<Book> foundBook = library.stream()
                .filter(book -> book.getName().equals(name))
                .findFirst();

        String bookString = foundBook.map(Book::toString).orElse("No a such Book");

        System.out.println("Found book -> " + bookString);

    }

    public void removeBook(String ISBN) {
        boolean bookExist = library.removeIf(book -> book.getISBN().equals(ISBN));

        if (bookExist) {
            System.out.println("Book removed");
        } else {
            System.out.println("Can't remove.No such book");
        }
    }


}
