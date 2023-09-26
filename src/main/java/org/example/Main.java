package org.example;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = Book.createBook("Adventures Of Tom Sawyer", "Mark Twain","9780195810400",1978);
        Book book2 = Book.createBook("Charlie and the Chocolate Factory", "Roald Dahl","9780060510657",2002);
        library.addBook(book1);
        library.addBook(book2);
        library.showAllBooks();
        System.out.println(library.findBookViaName("Adventures Of Tom Sawyer"));
        System.out.println(library.findBookViaName("Adventures Of Tommy Angelo"));
        library.removeBook("9780195810400");
        library.removeBook("9780195819400");
        library.showAllBooks();

    }
}
