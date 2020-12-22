package org.example.SpringContextLab;

public class Builder {
    public Shape createCircleShape() {
        ObjectInterface obj = new Circle();
        Shape shape = new Shape();
        shape.setObj(obj);

        return shape;
    }
    public Shape createPointShape() {
        ObjectInterface obj = new Point();
        Shape shape = new Shape();
        shape.setObj(obj);

        return shape;
    }
}
