package com.company;

import java.awt.*;

public class Phone {
    private String model;
    private int age;


    public int getAge() {
        return age;
    }

    public String getModel() {
        return model;
    }

    public Phone(int age, String model) {
        this.age = age;
        this.model = model;
    }
    public String Info(){
        return "--------------------"+
                "\nInformatoin about "  + getClass().getSimpleName() + ":" +
                "\nModel: "+ model +
                "\nAge " + age;
    }
    }

