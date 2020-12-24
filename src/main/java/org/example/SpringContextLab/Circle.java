package org.example.SpringContextLab;

public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;

    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    Circle() {}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println(String.format("x = %d, y = %d, radius = %d", getX(),getY(), getRadius()));
    }

}
