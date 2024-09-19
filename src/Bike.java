public class Bike {

    private boolean isActive;
    private int speed;
    private int gear;

    public void powerOn() {
        isActive = true;
    }

    public void powerOff() {
        isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }

    public void accelerate() {
        if (isActive) {
            if (speed >= 0 && speed <= 20) {
                speed++;
            } else if (speed > 20 && speed <= 30) {
                speed += 2;
            } else if (speed > 30 && speed <= 40) {
                speed += 3;
            } else if (speed < 40) {
                speed += 4;
            }
        }
    }

    public int getBikeSpeed() {
        return speed;
    }

    public void Decelerate() {
        if (isActive) {
            if (speed >= 0 && speed <= 20) {
                speed--;
            } else if (speed > 20 && speed <= 30) {
                speed -= 2;
            } else if (speed > 30 && speed <= 40) {
                speed -= 3;
            } else if (speed < 40) {
                speed -= 4;
            }
        }
    }

    public int getBikeDeceleration() {
        return speed;
    }

    public void increaseGear() {
        if (isActive) {
            if (speed >= 0 && speed <= 20) {
                gear = 1;
            } else if (speed > 20 && speed <= 30) {
                gear = 2;
            } else if (speed > 30 && speed <= 40) {
                gear = 3;
            } else if (speed > 40) {
                gear = 4;
            }

        }
    }

    public int getGear() {
        return gear;
    }



}



