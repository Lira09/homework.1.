package com.company;

public class Samsung extends Apple {
    private int cdCard;
    private String touchID;

    public Samsung(Color color, String widgets, int cdCard) {
        super(color, widgets);
        this.cdCard = cdCard;
    }

    public Samsung(int age, String model, Color color, String faceID, String widgets, Country country, int cdCard, String touchID) {
        super(age, model, color, faceID, widgets, country);
        this.cdCard = cdCard;
        this.touchID = touchID;
    }

    public String getTouchID() {
        return touchID;
    }

    public int getCdCard() {
        return cdCard;
    }


    @Override
    public void function(String which, int hours) {

    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("\n" +
                "CD card: " + cdCard + "\n" +
                "Touch ID: " + touchID);
    }
}
