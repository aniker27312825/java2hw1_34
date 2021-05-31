package com.company;

import javax.crypto.Mac;

public class Main {

    public static void main(String[] args) {
	/*a)  Доделать все пункты практического задания по презентации
b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
c)  Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же (4й класс),
одно из полей сделать сложного типа (enum)
d)  В классах не должно быть setter-ов, только getter-ы и конструкторы
e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
f)  В классе 3-го уровня перезаписать один из методов родителя
g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB,
 objectC), также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров ваших
  объектов.

На сообразительность
h)  Написать метод в классе 3-го уровня который бы копировал некоторые свойства из себеподобного объекта
i)  Затем скопировать несколько свойств из objectB в objectC и распечатать информацию по objectC*/
        Age age = new Age(2020);
        Notebook objectA = new Notebook(Color.BLACK,age,512,true );
        objectA.printInfo();
        objectA.printInfo(512);
        objectA.printInfo(Color.BLACK, 512);
        Macbook objectB = new Macbook(Color.GOLD, new Age(2018),1024
                ,false,"Macbook Air","Core i-5");
        objectB.printInfo();
        objectB.printInfo(1024);
        objectB.printInfo(Color.GOLD, 1024);
        Macbook objectC = new Macbook(Color.GREY,new Age(2021), 256, true, "Macbook PRO",
                "Core i-7");
        objectC.printInfo();
        objectC.printInfo(256);
        objectC.printInfo(Color.GREY, 256);
        objectC.copyElements(objectB);
        objectC.printInfo();

    }
}
