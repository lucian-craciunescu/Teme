package org.example.Cinema;

public class Director {
    public String name;
    public int birthYear;
    public Director(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }

}
