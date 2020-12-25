package ru.specialist.dbala.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@Builder
public class Circle implements Drawable {

//    double x = new Random().nextDouble();
//    double y;
    private Coordinates center;
    private double radius;

    @Override
    public void draw() {
        System.out.println("Drawing a circle: " + this);
    }
}
