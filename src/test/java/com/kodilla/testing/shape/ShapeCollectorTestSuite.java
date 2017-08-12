package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(1.0);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());
        //Dlaczego w metodzie getShapesQuantity muszę zwracać int, a nie Integer, żeby assertEquals przyjął parametr?
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(1.0);
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(1.0);
        shapeCollector.addFigure(square);
        //When
        Shape retrievedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(square, retrievedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(1.0);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(square);
        //When
        String retrievedShapes = shapeCollector.showFigures();
        //Then
        Assert.assertEquals(square.getShapeName() + ", " + square.getShapeName(), retrievedShapes);
    }

}
