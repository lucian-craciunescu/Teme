package org.example;

public class Shapes {
    public static void main(String[] args) {
//       Square sq = new Square();
//       sq.setSide(7);
//
//
//            System.out.println(sq.getArea());
//
//       }
        for (int i = 1; i <= 5; i++) {
            Square square = new Square();
            square.setSide(i);
            System.out.println(square.getArea());
        }




    }
}

