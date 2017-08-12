package com.kodilla.testing;

import com.kodilla.testing.collection.CollectionUtils;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args) {
//
//        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
//        ArrayList<Integer> numbers = CollectionUtils.generateNumbersArray(0, 100);
//        System.out.println(oddNumbersExterminator.exterminate(numbers));

        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1.0);
        Square square = new Square(1.0);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        System.out.println(shapeCollector.showFigures());
    }
}