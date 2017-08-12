package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollection = new ArrayList<>();


    public ArrayList<Shape> getShapeCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        Boolean result = false;
        if (shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureIndex) {
        Shape figure = null;
        if (figureIndex >= 0 && figureIndex < shapeCollection.size()) {
            figure = shapeCollection.get(figureIndex);
        }
        return figure;
    }

    public String showFigures() {
        String shapes = "";
        int counter = 1;
       if (!shapeCollection.isEmpty()) {
           for (Shape shape : shapeCollection) {
               if (counter < shapeCollection.size()) {
                   shapes += shape.getShapeName() + ", ";
               } else {
                   shapes  += shape.getShapeName();
               }
               counter++;
           }
       }
       return shapes;
    }

    public int getShapesQuantity() {
        return shapeCollection.size();
    }

}
