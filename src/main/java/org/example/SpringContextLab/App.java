package org.example.SpringContextLab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ObjectInterface obj = context.getBean("objectBean", ObjectInterface.class);
        Shape shape = context.getBean("shapeBean", Shape.class);

        shape.setObj(obj);
        shape.getObj().draw();
    }
}
