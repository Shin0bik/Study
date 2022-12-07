package ru.shinobik.study.padawan;

import ru.shinobik.study.lesson4.Cat;
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
        greatestNumber(array);
        secondLowestNumber(array);
        reverseArray(array);
        Cat vasya = new Cat("Vasya", 5, 4);
        Cat murzilo = new Cat("Murzilo", 4, 3.5);
        vasya.play(murzilo);
    }

    public static void calculateProduct(int[] array) {
        ArrayUtil.printArray(array);
        int product = 0;
        for (int n = 0; n < array.length; n++) {
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 150 && (array[i] % 2 != 0)) {
                System.out.println(array[i]);
            }
        }
    }

    //посчитать сумму всех чётных чисел и вывести её на экран,
    public static void everyEvenSumm(int[] array) {
        ArrayUtil.printArray(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }

    //Взять массив ArrayUtil и посчитать среднее арифметическое каждого 3 элемента массива
    public static void averageEveryThird(int[] array) {
        ArrayUtil.printArray(array);
        int average = 0;
        int count = 0;
        int sum = 0;
        for (int i = 2; i < array.length; i = i + 3) {
            sum = sum + array[i];
            count++;
        }
        average = sum / count;
        System.out.println(average);
    }

    //Взять массив и найти в нём самое маленькое число.
    public static void lowestNumber(int[] array) {
        ArrayUtil.printArray(array);
        int lowest = array[0];            //  {199, 90, 30, 199, 142, 51, 170}
        for (int i = 1; i < array.length; i++) {  //i = 2, lowest = 90, array[2] = 30
            if (array[i] <= lowest) {     // 30 <= 90
                lowest = array[i];        // lowest 30
            }
        }
        System.out.println(lowest);
    }

    //Найти в массиве самое большое число.
    public static void greatestNumber(int[] array) {
        ArrayUtil.printArray(array);
        int greatest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= greatest) {
                greatest = array[i];
            }
        }
        System.out.println(greatest);
    }

    //Найти второе самое маленькое число, и оно не должно быть равным первому.
    public static void secondLowestNumber(int[] array) {
        ArrayUtil.printArray(array);
        int firstLowest = array[0];
        int secondLowest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < firstLowest) {
                secondLowest = firstLowest;
                firstLowest = array[i];
            } else if (array[i] < secondLowest || secondLowest == firstLowest) {
                secondLowest = array[i];
            }
        }
        System.out.println(secondLowest);
    }

    //Взять массив и вывести его в обратном порядке на экран.

    public static void reverseArray(int[] array) {
        ArrayUtil.printArray(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }


}