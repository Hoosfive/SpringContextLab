package org.example.SpringContextLab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Point point = context.getBean("pointBean", Point.class);
        Circle circle = context.getBean("circleBean", Circle.class);*/
        ObjectInterface obj = context.getBean("objectBean", ObjectInterface.class);
        Shape shape = context.getBean("shapeBean", Shape.class);

        shape.setObj(obj);
        shape.getObj().draw();
        context.close();
    }
}
