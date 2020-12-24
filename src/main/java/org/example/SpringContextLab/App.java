package org.example.SpringContextLab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scene scene = context.getBean("sceneBean", Scene.class);
        scene.draw();
    }
}
