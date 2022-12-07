package ru.shinobik.study.lesson4;

public class Cat {
    String name;          //поля - переменные, объявленные на уровне класса.
    int age;
    double weight;

    public Cat(){
        //<модификатор доступа> <? - (необязательное поле) Статичность> <возвращаемый тип данных> <Название метода>
        //после сигнатуры всегда идут круглые скобки, без пробела, в них либо пишутся, либо не пишутся входящие аргументы
    }

    public Cat(String name, int age, double weight) {
         this.name = name;
         this.age = age;
         this.weight = weight;
    }

    public void play(Cat cat){
        System.out.println(this.name + " играет с "+ cat.name);
    }
}
