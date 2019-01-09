package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Game game = new Game();
        game.start();

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


        /*
        //Polymorphism (an object can take many forms)
        Vehicle vehicle1 = new FakeVehicle();

        // the implementation from the class of the object itself will be called, not from the class of the variable
        vehicle1.accelerate(200, 2);

        //you can only call methods exposed by the class of the variable
        vehicle1.disappear();

        //You can use type CASTING to temporarily change the type of the variable,
        // so you can call methods from the class of the object itself
        ((FakeVehicle) vehicle1).disappear();
        // type casting is temporary, it doesn't permanently change the variable itself
        vehicle1.disappear();
        //you can only cast to related classes
        (double) vehicle1;
        */
    }
}
