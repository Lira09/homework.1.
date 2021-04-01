package com.company;

public class Main {

    public static void main(String[] args) {
    /*Apple apple = new Apple(2019,"iPhone 11", "face","AppStore");
    Samsung samsung1 = new Samsung(2016,"Galaxy 7", "face","Galary","China",Color.BLACK,16,"Imprint");
    Samsung samsung2 = new Samsung(2018,"Galaxy 11", " face", "Music","Korea",Color.SILVER , 32, "Imprint");
        System.out.println(apple.Info() + samsung1.Info() + samsung2.Info() + get);*/

        Apple apple = new Apple(2020, "iPhone 12", Color.WHITE, "Have faceID", "App Store",
                new Country("USA", "3rd st"));
        apple.Info();
        apple.function("NFC");

        Samsung samsung = new Samsung(2018, "A8", Color.BLACK, "Have not ", "GALLERY",
                new Country("SEOUL", "Long st.11"), 1, "imprint");
        samsung.Info();




    }


}
//h)  Написать метод в классе 3-го уровня который бы копировал некоторые свойства из себеподобного объекта
//i)  Затем скопировать несколько свойств из objectB в objectC и распечатать информацию по objectC

