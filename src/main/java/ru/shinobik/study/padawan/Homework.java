package ru.shinobik.study.padawan;

import ru.shinobik.study.util.ArrayUtil;

public class Homework {
    public static void main(String[] args) {
        int[] array = ArrayUtil.getArray(7, 4, 200);
        //0,1,2,3...74
        calculateProduct(array);
        justMore(array);
        everyEvenSumm(array);
        averageEveryThird(array);
        lowestNumber(array);
    }

    public static void calculateProduct(int[] array) {
        ArrayUtil.printArray(array);
        int size = array.length;
        int product = 0;
        for (int n = 0; n < size; n++) {
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

//вывести из массива на экран нечётные числа больше 150

    public static void justMore(int[] array) {
        ArrayUtil.printArray(array);
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] > 150 && (array[i] % 2 != 0)) {
                System.out.println(array[i]);
            }
        }
    }

    //посчитать сумму всех чётных чисел и вывести её на экран,
    public static void everyEvenSumm(int[] array) {
        ArrayUtil.printArray(array);
        int size = array.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }

    //Взять массив ArrayUtil и посчитать среднее арифметическое каждого 3 элемента массива
    public static void averageEveryThird(int[] array) {
        ArrayUtil.printArray(array);
        int size = array.length;
        int average = 0;
        int count = 0;
        int sum = 0;
        for (int i = 2; i < size; i = i + 3) {
            sum = sum + array[i];
            count++;
            average = sum / count;
        }
        System.out.println(average);
    }

    //Взять массив и найти в нём самое маленькое число.
    public static void lowestNumber(int[] array) {
        ArrayUtil.printArray(array);

    }
}