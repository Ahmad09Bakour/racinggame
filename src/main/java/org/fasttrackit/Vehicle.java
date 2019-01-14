package org.fasttrackit;

public class Vehicle {

    // an example for the difference between class variables (Static) and instance variable (non-static)
    public static final String Type_Of_Fuel = "Diesel";  // final is to give it a value which will never change
                          // final class = class will never be inherited (hard coded)
    private String name;
    private String color;
    private Driver driver;
    private double mileage;
    private double fuelLevel;
    private double travelDistance;

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // useless method just to demonstrate co-variant return type example and extending access in overriding method
    protected Vehicle returnMyself(){
        return this;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    //method signature: return type (void or something else) + nem + list of params (0 or more)
    public double accelerate(double speed, double durationInHours) {
        // method body
        System.out.println("Acceleration speed: " + speed);
        double distance = speed * durationInHours;

        double consumedFuel = mileage / distance * 100;
        System.out.println("Consumed fuel: " + consumedFuel);
        // this is the same as: fuelLevel = fuelLevel - consumedFuel;
        fuelLevel -= consumedFuel;

        travelDistance += distance;

        System.out.println("Total traveld distance for vehicle " + name + ": " + travelDistance);
        return distance;
    }
    // backward compatibility ... add a method which is used in the app in the past without changing it (overloading)
    // basically it's calling the same method with two ways or more ....
    public  double accelerate(double speed){
        return accelerate(speed, 1);     // the parameter durationHours here is hard coded
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // Use Alt + Insert to override th toString() method


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", driver=" + driver +
                ", mileage=" + mileage +
                ", fuelLevel=" + fuelLevel +
                ", travelDistance=" + travelDistance +
                '}';
    }
}


