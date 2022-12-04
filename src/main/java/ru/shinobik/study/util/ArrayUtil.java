package ru.shinobik.study.util;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

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
    public static void printArray(int[] array) {
        System.out.println("------ARRAY------");
        System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
        System.out.println("-----------------");
        }
}
