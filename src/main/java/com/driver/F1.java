package com.driver;

public class F1 extends Car {
    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "F1");
    }

    public void accelerate(int rate) {
        int newSpeed = this.getCurrentSpeed() + rate;
        if (newSpeed == 0) {
            this.stop();
            this.changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 50) {
            this.changeGear(1);
        } else if (newSpeed > 50 && newSpeed <= 100) {
            this.changeGear(2);
        } else if (newSpeed > 100 && newSpeed <= 150) {
            this.changeGear(3);
        } else if (newSpeed > 150 && newSpeed <= 200) {
            this.changeGear(4);
        } else if (newSpeed > 200 && newSpeed <= 250) {
            this.changeGear(5);
        } else {
            this.changeGear(6);
        }

        if (newSpeed > 0) {
            this.changeSpeed(newSpeed, this.getCurrentDirection());
        }

    }
}
