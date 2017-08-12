package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.collection.CollectionUtils;
import com.kodilla.testing.collection.OddNumbersExterminator;
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
        //Given
        oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Test case: begin");
    }

    @After
    public void informAboutEndOfTests() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Testing OddNumbersExterminator on empty list");
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        result = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(emptyList, result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing OddNumbersExterminator on normal list");
        //Given
        ArrayList<Integer> numbersList = CollectionUtils.generateNumbersArray(0,100);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        for (int i = 2; i <= 100; i += 2) {
            expectedResult.add(i);
        }
        //When
        result = oddNumbersExterminator.exterminate(numbersList);
        //Then
        Assert.assertEquals(expectedResult, result);
    }


}
