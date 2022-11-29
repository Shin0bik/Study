package ru.shinobik.study.padawan;

import ru.shinobik.study.util.ArrayUtil;

public class Homework {
    public static void main(String[] args) {
        int[] array = ArrayUtil.getArray(75, 80, 107);
        //0,1,2,3...74
        calculateProduct(array);
    }


    public static void calculateProduct(int[] array) {
        int size = array.length;
        long product = 0;
        for(int n = 0; n < size; n++) {
            if (array[n] > 20) {
               if (product == 0) {
                   product = array[n];
               } else {
                   product = product * array[n];
               }

            }

        }
        System.out.println(product);
    }

}
