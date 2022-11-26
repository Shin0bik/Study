package ru.shinobik.study.util;

import java.util.Random;

public class ArrayUtil {

    private static final Random random = new Random();

    private ArrayUtil() {

    }

    public static int[] getArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = getRandomInt(minValue, maxValue);
        }
        return array;
    }

    private static int getRandomInt(int minValue, int maxValue) {
        return random.nextInt(maxValue - minValue) + minValue;
    }
}
