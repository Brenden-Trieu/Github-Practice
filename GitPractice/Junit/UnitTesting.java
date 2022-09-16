package Junit;

import main.*;
import org.junit.*;
import org.junit.internal.ArrayComparisonFailure;
import org.junit.internal.ExactComparisonCriteria;

public class UnitTesting {
    @Test
    public void NumberTest() {
        int[] tester = { 19, 5, 44, 48, 1, 88, 50, 37 };
        int[] result = { 1, 5, 19, 37, 44, 48, 50, 88 };
        App.sortNum(tester);
        assertArrayEquals(result, tester);
        return;
    }

    public void StringTest() {
        String[] wordsArr = { "Ricky", "Arson", "Punk", "Zipper", "Mary" };
        String[] resultStrings = { "Arson", "Mary", "Punk", "Ricky", "Zipper" };
        App.sortString(wordsArr);
        Assert.assertArrayEquals(resultStrings, wordsArr);
    }

    public static void assertArrayEquals(int[] expecteds, int[] actuals) throws ArrayComparisonFailure {
        internalArrayEquals(null, expecteds, actuals);
    }

    private static void internalArrayEquals(String message, Object expecteds,
            Object actuals) throws ArrayComparisonFailure {
        new ExactComparisonCriteria().arrayEquals(message, expecteds, actuals);
    }
}
