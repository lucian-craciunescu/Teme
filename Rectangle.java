package org.example;

public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getArea() {
        return lenght * width;
    }
    public double getPerimeter() {
        return 2 * (lenght + width);
    }
    public double getDiagonal() {
        return Math.sqrt(Math.pow(lenght, 2) + Math.pow(width, 2));
    }
    public static void main(String[] args) {
        double lenght = 8;
        double width = 6;
        Rectangle rectangle = new Rectangle (lenght, width);
        System.out.println("Lenght: " + lenght);
        System.out.println("Width: " + width);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Diagonal: " + rectangle.getDiagonal());
    }

}
