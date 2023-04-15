package com.driver;

public class Vehicle implements WaterVehicle{
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + this.currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + this.currentSpeed + ", and the direction is changed to: " + this.currentDirection + " degrees");
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int getCurrentDirection() {
        return this.currentDirection;
    }

    @java.lang.Override
    public String getVehicleName() {
        return name;
    }

    @java.lang.Override
    public int getVehicleCapacity() {
        return 0;
    }
}
