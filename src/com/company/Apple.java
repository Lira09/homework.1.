package com.company;

public class Apple extends Phone{
    private  int age;
private String faceID;
private String widgets;

    public Apple(int age, String model, String faceID, String widgets ) {
        super(age, model);
        this.faceID = faceID;
        this.widgets = widgets;
    }

    public Apple(int age, String s, String human, String model, Information year) {
        super(age, model);
    }
    public String getWidgets() {
        return widgets;
    }
    public String getFaceID() {
        return faceID;

    }

    public void function(String which , int hours){
        System.out.println("-------\n " + getClass().getSimpleName() + getModel() + " use "
                + which + "," + hours + " hours a day ");
    }

    public final void function (String which ){
        System.out.println("-------\n " + getClass().getSimpleName() + getModel() + " use "
                + which );
    }
    @Override
    public String Info(){
        return super.Info() +
                "\nFaceID " + faceID + "\nWidgets " + widgets;
    }
}


