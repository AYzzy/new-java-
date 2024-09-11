package Inheritance;

public class ElectricCar extends Vechicle{
    public ElectricCar(){
    }
    public ElectricCar(String color, String maker, String model){
        setColor(color);
        setMaker(maker);
        setModel(model);
    }


    @Override
    public void startEngines() {
        System.out.println("ElectricCar startEngine");
    }

}
