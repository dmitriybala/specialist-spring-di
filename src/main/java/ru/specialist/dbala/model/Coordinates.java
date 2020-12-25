package ru.specialist.dbala.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@Data
@AllArgsConstructor
//@Component
//@Scope("prototype")
public class Coordinates {

    private double x = new Random().nextDouble();
    private double y = new Random().nextDouble();

}
