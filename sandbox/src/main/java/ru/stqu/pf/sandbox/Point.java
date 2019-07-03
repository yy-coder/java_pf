package ru.stqu.pf.sandbox;

public class Point {
    public int x;
    public int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}
