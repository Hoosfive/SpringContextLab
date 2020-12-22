package org.example.SpringContextLab;

public class Shape {
    private ObjectInterface obj;

    Shape() {
    }

    Shape(ObjectInterface obj) {
        this.obj = obj;
    }

    public ObjectInterface getObj() {
        return obj;
    }

    public void setObj(ObjectInterface obj) {
        this.obj = obj;
    }
}
