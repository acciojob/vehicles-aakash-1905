package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,4,2,6,isManual,"F1",2);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
            newSpeed += getCurrentSpeed() + rate;
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            setCurrentGear(1);

        }
        //for all other cases, change the gear accordingly
        if(newSpeed <=50 && newSpeed >=1){
            setCurrentGear(1);
        }
        if(newSpeed <=100 && newSpeed >=51){
            setCurrentGear(2);
        }
        if(newSpeed <=150 && newSpeed >=101){
            setCurrentGear(3);
        }
        if(newSpeed <=200 && newSpeed >=151){
            setCurrentGear(4);
        }
        if(newSpeed <=250 && newSpeed >=201){
            setCurrentGear(5);
        }
        if( newSpeed>250){
            setCurrentGear(6);
        }
        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
