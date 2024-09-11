package Inheritance;

public class Main {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.startEngines();
        car.setColor("blue");
        System.out.println(car.getColor());
        car.setModel("2015");
        System.out.println(car.getModel());
        car.setMaker("toyota");
        System.out.println(car.getMaker());
    }
}
