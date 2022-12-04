package ru.shinobik.study.lesson3;

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
    }
    public static void lesson3Stroka(String s, int n)
}
