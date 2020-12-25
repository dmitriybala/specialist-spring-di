package ru.specialist.dbala.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Builder
public class Point implements Drawable {

    //    double x = new Random().nextDouble();
//    double y;
    private Coordinates coordinates;

    @Override
    public void draw() {
        System.out.println("Drawing a point: " + this);
    }
}
