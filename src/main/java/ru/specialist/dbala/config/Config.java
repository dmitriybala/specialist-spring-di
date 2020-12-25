package ru.specialist.dbala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import ru.specialist.dbala.model.Circle;
import ru.specialist.dbala.model.Coordinates;
import ru.specialist.dbala.model.Point;

import java.util.Random;

public class Config {

    @Bean
    @Scope("prototype")
    public Coordinates getCoordinates() {
        Random random = new Random();
        return new Coordinates(random.nextDouble(), random.nextDouble());
    }

    @Bean
    @Scope("prototype")
    public Circle getCircle() {
        return Circle.builder()
                .center(getCoordinates())
                .radius(new Random().nextDouble())
                .build();
    }

    @Bean
    @Scope("prototype")
    public Point getPoint() {
        return Point.builder()
                .coordinates(getCoordinates())
                .build();
    }

}
