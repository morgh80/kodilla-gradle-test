package com.kodilla.testing;

import com.kodilla.testing.collection.CollectionUtils;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args) {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = CollectionUtils.generateNumbersArray(0, 100);
        System.out.println(oddNumbersExterminator.exterminate(numbers));
    }
}