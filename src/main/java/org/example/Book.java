
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
        try {
            if(ISBN.length() != 10 && ISBN.length() != 13){
                throw new IllegalArgumentException("Wrong ISBN of book ->" + name + " ISBN can consist only of 10 or 13 digits");


            }

        }
        catch(IllegalArgumentException ex){
            System.err.println(ex.getMessage());
            return null;

        }

        try {
            if(yearOfEdition < 1445){
                throw new IllegalArgumentException("Wrong year of book ->" + name + " Printing of books started at 1445 A.D");
            }

        }
        catch(IllegalArgumentException ex){
            System.err.println(ex.getMessage());
            return null;


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
