package com.kodilla.testing.shape;

public class Circle implements Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return "circle";
    }

    public Double getField() {
        return radius * radius * Math.PI;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return radius.equals(circle.radius);
    }

    @Override
    public int hashCode() {
        return radius.hashCode();
    }
}
