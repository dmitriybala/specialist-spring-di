package ru.specialist.dbala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.specialist.dbala.config.Config;
import ru.specialist.dbala.model.Circle;
import ru.specialist.dbala.model.Point;
import ru.specialist.dbala.model.Scene;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Scene scene = context.getBean("myScene", Scene.class);
//        scene.draw();

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Circle myCircle = context.getBean(Circle.class);
        myCircle.draw();

        myCircle = context.getBean(Circle.class);
        myCircle.draw();

        Point myPoint = context.getBean(Point.class);
        myPoint.draw();

        myPoint = context.getBean(Point.class);
        myPoint.draw();
    }

}
