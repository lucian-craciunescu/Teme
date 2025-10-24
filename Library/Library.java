package org.example.Library;

public class Library {
    public static void main(String[] args) {
        Author author = new Author("Lucian Craciunescu", "l.craciunescu@boogle.com");
        Book book = new Book("Cei trei musafiri", 1900, author, 19.93);

        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by "
                + book.getAuthor().getName() + ", published in " + book.getYear());
    }
}

