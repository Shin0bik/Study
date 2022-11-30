package ru.shinobik.study.padawan;

import ru.shinobik.study.util.ArrayUtil;

public class Homework {
    public static void main(String[] args) {
        int[] array = ArrayUtil.getArray(75, 80, 1107);
        //0,1,2,3...74
        calculateProduct(array);
        justMore(array);
    }
    public static void calculateProduct(int[] array) {
        int size = array.length;
        int product = 0;
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

//вывести из массива на экран числа больше 150

    public static void justMore(int[] array) {
        int size = array.length;
        int value = 0;
        for(int i = 0; i < size; i++){
            if(array[i] > 150){
                if (array[i] % 2 == 0) {
                    i++;
                } else {
                    value = array[i];
                }
            } else {
                i++;
            }
            System.out.println(value);
        }
    }
}