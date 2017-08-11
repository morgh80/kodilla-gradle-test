package com.kodilla.testing.collection;

/*
W utworzonym pakiecie stwórz klasę testową (zbiór testów) CollectionTestSuite, a w niej napisz testy sprawdzające
czy metoda filtrująca liczby nieparzyste działa poprawnie:
testOddNumbersExterminatorEmptyList (sprawdzi czy klasa zachowuje się poprawnie gdy lista jest pusta)
testOddNumbersExterminatorNormalList (sprawdzi czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste)
Użyj również adnotacji @Before oraz @After, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    private OddNumbersExterminator oddNumbersExterminator;
    private ArrayList<Integer> result;

    @Before
    public void setUpTest() {
        oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("Test case: begin");
    }

    @After
    public void informAboutEndOfTests() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Testing OddNumbersExterminator on empty list");

        ArrayList<Integer> emptyList = new ArrayList<>();
        result = oddNumbersExterminator.exterminate(emptyList);
        Assert.assertEquals(emptyList, result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing OddNumbersExterminator on normal list");


        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbersList.add(i);
        }

        ArrayList<Integer> expectedResult = new ArrayList<>();
        for (int i = 2; i <= 100; i = i+2) {
            expectedResult.add(i);
        }

        result = oddNumbersExterminator.exterminate(numbersList);
        Assert.assertEquals(expectedResult, result);
    }


}
