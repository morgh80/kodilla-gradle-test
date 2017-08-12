package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private Double base;
    private Double height;

    public Triangle(Double base, Double height ) {
        this.base = base;
        this.height = height;
    }

    public String getShapeName() {
        return "triangle";
    }

    public Double getField() {
       return (base * height) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!base.equals(triangle.base)) return false;
        return height.equals(triangle.height);
    }

    @Override
    public int hashCode() {
        int result = base.hashCode();
        result = 31 * result + height.hashCode();
        return result;
    }
}
