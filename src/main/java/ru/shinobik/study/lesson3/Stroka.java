package ru.shinobik.study.lesson3;

import javafx.scene.control.IndexRange;

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
//        stringOut();
//        moreOrLess();
//        wordCounter();
//        checkString();
        reversePrint("Задом");
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
            System.out.print(example.charAt(example.length()-1-i));
        }
    }


}

