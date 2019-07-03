package ru.stqu.pf.sandbox;

import static ru.stqu.pf.sandbox.Point.distance;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("Nurlan");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p1 = new Point(6,2);
        Point p2 = new Point(2,4);

        System.out.println("Расстояние между точками = " + distance(p1, p2));


    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }


}