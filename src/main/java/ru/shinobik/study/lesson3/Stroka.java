package ru.shinobik.study.lesson3;

import javafx.scene.control.IndexRange;
import ru.shinobik.study.lesson4.Car;
import ru.shinobik.study.lesson4.Dog;
import ru.shinobik.study.util.ArrayUtil;

import java.util.Arrays;

public class Stroka {
    public static void main(String[] args) {
        String stroka = new String("S1");
        String stroka2 = "Stroka1";
        String stroka3 = "S1";
        System.out.println(stroka2 == stroka3);
        System.out.println(stroka == stroka2);
        System.out.println(stroka.equals(stroka2));
        stroka2 = stroka2 + stroka3;
        stroka2 = new String(stroka2 + stroka3);
        String stroka4 = null; // = null;
        System.out.println(stroka4 == null);
        String substring = stroka2.substring(2, 5);
        System.out.println(substring);
        stringOut("Печенюшки", 5);
        moreOrLess("Некая строка, для примера");
        wordCounter("Триста пиров мне в раздачу");
        checkString("Lovestospooch", "spooch");
        reversePrint("Задом");
        squareOfTheNumber(6);
        factorial(5);
        int[] array1 = ArrayUtil.getArray(5,1,10);
        int[] array2 = ArrayUtil.getArray(5,4,12);
        int[] array3 = ArrayUtil.getArray(8,1,10);
        compareArrays(array1, array1);
        compareArrays(array1, array2);
        compareArrays(array2, array3);

    }


    //написать новый метод psv : На вход даётся строка, и мой метод должен распечатать эту строку n раз.
    public static void stringOut(String s, int n) {
        while (n > 0) {
            System.out.println(s);
            n--;
        }
    }

    //на вход даётся строка, на выходе на экран печатается, если строка больше 10 символов то печатается всё, что начинается с 5 символа этой строки,
    public static void moreOrLess(String s) {
        if (s.length() < 10) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(5));

        }
    }

    //На вход даётся строка и распечатать количество слов в этой строке.
    public static void wordCounter(String str) {
        String[] words = str.split("\\s+", 0);
        System.out.println(words.length);
    }

    //4)На вход даётся 2 строки, нужно сказать входит ли строка "2" в строку "1"
    public static void checkString(String numOne, String numTwo) {
        System.out.println(numOne.contains(numTwo));
    }

    //5)Перевернуть строку, вывести её задом наперёд.
    public static void reversePrint(String example) {
        for (int i = 0; i < example.length(); i++) {
            System.out.print(example.charAt(example.length() - 1 - i));
        }
    }

    // Написать метод, создающий массив квадратов чисел от 1 до N (включительно). Например: N = 5, тогда array = {1, 4, 9, 16, 25}
    public static void squareOfTheNumber(int number) {
        int[] squareArray = new int[number];
        for (int i = 1; i <= number; i++) {
            squareArray[i - 1] = i * i;
        }
        String squareArrays = Arrays.toString(squareArray);
        System.out.println(squareArrays);
    }

    // Написать метод, считающий факториал N. (Факториал это произведение всех целых от 1 до N)
    public static void factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = i * factorial;
        }
        System.out.println(factorial);
    }

    //Написать метод, который определяет, идентичны ли два массива (по наполнению, т.е. равен ли первый элемент одного массива первому элементу другого и т.д.)
    public static void compareArrays(int arrayOne[], int arrayTwo[]) {
        boolean equal = arrayOne.length == arrayTwo.length;
        if (equal) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println(equal);
    }

    //Написать метод, который посчитает среднее арифметическое всех нечетных чисел в массиве
    public static void oddAverage(int[] array){
        int oddAverage;
        int counterArraysOdd = 0;
        int sum = 0;
        for(int i = 0; i < array.lenght; i++){
            if (array[i] % 2 != 0){
                sum = sum + array[i];
            counterArraysOdd++;
            }
        }
        oddAverage = sum / counterArraysOdd;
        System.out.println(oddAverage);
    }

    //Написать метод, который принимает на вход массив строк и находит там строку с самой маленькой длиной
    public static void shortestString(String[] someString){
        int shortest = someString[0].length();
        for (int i = 1; i < someString.lenght; i++){
            if (shortest < someString[i].length()){
                shortest = someString[i].length();
            }
        }
        System.out.println(someString[shortest]);
    }

    //Написать класс машина с полями: цвет, марка, модель. Написать метод, который принимает на вход массив машин и считает количество машин красного цвета марки bmw

    public static void redBMW(Car[] cars){
        int counter = 0;
        for(int i = 0; i < cars.length; i++){
            if (cars[i].equals(Car carColor == "red") && cars[i].equals(Car carBrand == "BMW")){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

