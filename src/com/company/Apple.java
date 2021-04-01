package com.company;

public class Apple extends Phone {
    private String faceID;
    private String widgets;
    private Country country;
    private Color color;
    private String model;
    private int age;


    public Apple(Color color, String widgets) {
        this.color = color;
        this.widgets = widgets;


    }

    public Apple(int age, String model, Color color,String faceID, String widgets, Country country) {
        this.color = color;
        this.age = age;
        this.model = model;
        this.faceID = faceID;
        this.widgets = widgets;
        this.country = country;

    }

    public String getWidgets() {
        return widgets;
    }

    public String getFaceID() {
        return faceID;

    }


    public Color getColor() {
        return color;
    }

    public Country getCountry() {
        return country;
    }


    public String getModel() {
        return model;
    }


    public int getAge() {
        return age;
    }

    public void function(String which, int hours) {
        System.out.println("-------\n " + "" +
                getClass().getSimpleName() + "\n" +
                "Model: " + getModel() + "\n" +
                "Use: " + which + "," + " hours a day: " + hours);
    }

    public final void function(String which) {
        System.out.println("-------\n" + getClass().getSimpleName() + "Model: "+getModel() + "\n" +
                "Use function: " + which);
    }

    public void Info() {
        super.Info();
        System.out.println("\n" +
                "Model: " + model + "\n" +
                "Age: " + age + "\n" +
                "Color: " + color + "\n" +
                "Widgets: " + widgets + "\n" +
                "FACEID: " + faceID + "\n" +
                "Country: " + getCountry().getCity() + "\n" +
                "Address: " + getCountry().getAddress());
    }


}


