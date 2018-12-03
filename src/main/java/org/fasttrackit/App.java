package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        /*
        Engine truckEngine = new Engine();
        truckEngine.setManufacturer("Renault");
        AutoVehicle truck = new AutoVehicle(truckEngine);


        Engine testEngine = new Engine();
        testEngine.setManufacturer("BMW");
        Car testCar = new Car(testEngine);

        System.out.println(testCar);

        Engine firstCarEngine = new Engine();
        firstCarEngine.setManufacturer("Audi");
        Car firstCar = new Car(firstCarEngine);
        firstCar.setName("Golf");
        System.out.println(firstCar.getName());

        Driver firstDriver = new Driver();
        firstDriver.name = "Tony";
        firstDriver.age = 39;

        firstCar.setDriver(firstDriver);

        Engine CarEngine = new Engine();
        CarEngine.setManufacturer("KIA");
        Car car = new Car(CarEngine);
        car.setName("      Dacia           ");
        car.setDoorCount(2);
        System.out.println(car.getName());

        double traveledDistance = car.accelerate(99.5, 0.5);

        System.out.println("Traveled distance:" + traveledDistance);

        */
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Jaguar");
        vehicle.setColor("Red");
        vehicle.accelerate(77);
    }
}
