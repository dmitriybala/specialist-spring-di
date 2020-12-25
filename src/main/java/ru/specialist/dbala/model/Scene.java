package ru.specialist.dbala.model;

import lombok.Data;

import java.util.List;

@Data
public class Scene implements Drawable {

    private Color color;
    private List<Drawable> elements;

    @Override
    public void draw() {
        System.out.println("Scene color: " + color);
        elements.forEach(Drawable::draw);
    }
}
