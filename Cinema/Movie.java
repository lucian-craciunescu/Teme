package org.example.Cinema;

import org.example.Library.Author;

public class Movie {
    private String title;
    private int year;
    private Director director;
    private double rating;

    public Movie(String title, int year, Director director, double rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public Director getDirector() {
        return director;
    }
    public double getRating() {
        return rating;
    }
}
