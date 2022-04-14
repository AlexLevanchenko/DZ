package com.company;

public class Main {

    public static void main(String[] args) {
        double x1 = 4;
        double x2 = 2;
        double square1 = Math.pow(x1, 2);
        double square2 = Math.pow(x2, 2);
        double perimetr1 = 4 * x1;
        double perimetr2 = 4 * x2;
        boolean sravnenie1 = square1 == perimetr1;
        boolean sravnenie2 = square2 == perimetr2;
        System.out.println("Квадрат со стороной x=4 имеет: " + "\n" +
                "Площадь: " + square1 + " Периметр: " + perimetr1 + "\n" +
                "Квадрат со стороной x=2 имеет: " + "\n" +
                "Площадь: " + square2 + " Периметр: " + perimetr2 + "\n" +
                "Периметр равен площади при стороне x=4: " + sravnenie1 + "\n" +
                "Периметр равен площади при стороне x=2: " + sravnenie2 + "\n");
    }
}
