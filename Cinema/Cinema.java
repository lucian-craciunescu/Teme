package org.example.Cinema;

public class Cinema {
    public static void main(String[] args) {
        Director director = new Director ("Lucian Craciunescu", 1993);
        Movie movie = new Movie ("The Avengers ", 2003, director, 86.95);

        System.out.println("Movie: " + movie.getTitle() + " " + "R:" + movie.getRating());
        System.out.println("Director: " + director.getName());
        System.out.println("Year: " + movie.getYear());
    }

}

