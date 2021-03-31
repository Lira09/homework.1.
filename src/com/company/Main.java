package com.company;

public class Main {

    public static void main(String[] args) {
    Apple apple = new Apple(2019,"iPhone11;","face;","Appstore.");
        Samsung samsung1 = new Samsung(2016,"Galaxy 7;","  face; " ," Galary; ",12," Imprint. " );

        Samsung samsung2 = new Samsung(2018," Galaxy 11; "," face; "," Music; ",36," Imprint. ");

        System.out.println(samsung1.Info() + samsung2.Info() + apple.Info() );
    }


}
//h)  Написать метод в классе 3-го уровня который бы копировал некоторые свойства из себеподобного объекта
//i)  Затем скопировать несколько свойств из objectB в objectC и распечатать информацию по objectC

