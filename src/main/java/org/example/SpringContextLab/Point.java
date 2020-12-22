package org.example.SpringContextLab;

public class Point implements ObjectInterface {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {}

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

    public void draw() {
        System.out.println(String.format("x = %d, y = %d",getX(),getY()));
    }

}
