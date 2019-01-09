package org.fasttrackit;

public class FakeVehicle extends Vehicle {

    // Ctrl + o ... change the behaviour of the a specific method
    // when i override a method the access of the overrided method should be the same or stronger than the parent class (public..)
    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println("Cheating.... ha ha ha!");
        return 2 * speed * durationInHours;
    }
    //method used to demonstrate
    public void disappear(){
        System.out.println("Where am i ?");
    }
}
