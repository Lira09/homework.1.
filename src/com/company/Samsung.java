package com.company;

public class Samsung extends Apple {
    private int cdCard;
    private String touchID;

    public Samsung(int age, String model, String faceID, String widgets, int cdCard, String touchID) {
        super(age, model, faceID, widgets);
        this.cdCard = cdCard;
        this.touchID = touchID;

    }

    public String getTouchID() {
        return touchID;
    }

    @Override
    public void function(String which, int hours) {
    }
    @Override
    public String Info(){
        return super.Info() +
                "\ncdCard " + cdCard + "\nTouchId " + touchID;
    }
}
