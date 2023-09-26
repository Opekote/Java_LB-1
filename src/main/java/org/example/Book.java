
package org.example;


public class Book {
    private final String name;
    private final String author;
    private final String ISBN;
    private final int yearOfEdition;

    private Book(String name, String author, String ISBN, int yearOfEdition) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfEdition = yearOfEdition;
    }

    public static Book createBook(String name, String author, String ISBN, int yearOfEdition) throws IllegalArgumentException{

        if(ISBN.length() != 10 && ISBN.length() != 13){
            throw new IllegalArgumentException("Wrong ISBN. ISBN can consist only of 10 or 13 digits");


        }

        if(yearOfEdition < 1445){
            throw new IllegalArgumentException("Wrong year. Printing of books started at 1445 A.D");
        }
        return new Book(name, author, ISBN, yearOfEdition);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", yearOfEdition=" + yearOfEdition;
    }
}
