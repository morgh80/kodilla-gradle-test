package com.kodilla.testing.shape;

public class Square implements Shape {
    private Double length;

    public Square(Double length) {
        this.length = length;
    }

    public String getShapeName() {
        return "square";
    }

    public Double getField() {
        return length * length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return length.equals(square.length);
    }

    @Override
    public int hashCode() {
        return length.hashCode();
    }
}
