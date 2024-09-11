package Inheritance;

public class Vechicle {
    String color;
    String model;
    String maker;
    boolean startEngine;
    public Vechicle() {
        this.color = "black";

    }
    public Vechicle(String color, String model, String maker) {
        this.color = color;
        this.model = model;
        this.maker = maker;
    }

    public void startEngines(){
        System.out.println("Vechicle starting engines...");
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    public String getMaker() {
        return maker;
    }
}
