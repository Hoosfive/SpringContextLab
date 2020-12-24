package org.example.SpringContextLab;

import java.util.List;

public class Scene {
    String color;
    private List<Shape> objects;

    Scene() {
    }

    Scene(String color, List<Shape> objects) {
        this.color = color;
        this.objects = objects;
    }

    public void draw() {
        System.out.println("Scene color is " + color + "\nList of objects: ");
        getObjects().forEach(Shape::draw);
    }

    public List<Shape> getObjects() {
        return objects;
    }

    public void setObjects(List<Shape> objects) {
        this.objects = objects;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
