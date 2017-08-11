package com.kodilla.testing.collection;

import java.util.ArrayList;

public final class CollectionUtils {

    public static ArrayList<Integer> generateNumbersArray(Integer from, Integer to) {
        ArrayList<Integer> numberArray = new ArrayList<>();
        for (Integer number = from; number <= to; number++) {
            numberArray.add(number);
        }
        return numberArray;
    }

}
