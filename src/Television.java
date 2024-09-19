public class Television {
    private boolean isActive;
    private int volume;

    private int channel;

    public void setActive() {
        isActive = true;
    }
    public void setInactive(){
        isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setIncreaseInVolume(){
        int increase = 100;
        if(isActive){
            if(volume <= increase){
                volume++;
            }
        }
    }

    public int getVolumeIncrease() {
        return volume;
    }
    public void setDecreaseInVolume(){
        int decrease =100;
        if(isActive) {
            if (volume <= decrease) {
                volume--;
            }
        }
    }
    public int getVolumeDecrease(){
        return volume;
    }

    public void setChannelToIncrement(){
        int incrementChannel = 20;
        if(isActive){
            if(channel <= incrementChannel){
                channel++;

            }
        }
    }

    public int getChannelToIncrement() {
        return channel;
    }
    public void setChannelToDecrement(){
        int decrementChannel = 20;
        if(isActive){
            if(channel <= decrementChannel){
                channel--;
            }

        }
    }

    public int getChannelToDecrement() {
        return channel;
    }
}
