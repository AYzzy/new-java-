package AirConditional;

public class AirConditional {
    private boolean isOn ;
    private int temperature = 16;
    public void setOff(){
        isOn =false;
    }
    public void setOn(){
        isOn = true;
    }


    public boolean isOn() {
        return isOn;
    }

    public void increaseTemperature() {
        if(!(temperature>=30))temperature++;
       else throw new RuntimeException("Temperature can't move beyond 30");
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if(temperature<30)temperature--;
        else throw new RuntimeException("Temperature can't move beyond 16");

    }
}
