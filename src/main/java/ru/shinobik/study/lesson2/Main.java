package ru.shinobik.study.lesson2;

import ru.shinobik.study.util.ArrayUtil;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int a = 5;
        int size = array.length;
        array[1] = 10;
        array[2] = 20;
        int c = array[2] / array[1];
        int[] newArray = ArrayUtil.getArray(10, 3, 250);
        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i] + " " + newArray[i] * 2);
        }
    }
}
