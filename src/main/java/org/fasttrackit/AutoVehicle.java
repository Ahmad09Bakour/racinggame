package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    Engine engine;

    // constructors don't have name or return
    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle() {
        this(new Engine());
        // overloading a constructor .... have a default constructor of the engine constructor with the option
        // no needing to add an engine
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //co-variant return type example
    // access modifier in overridden method is more permissive

    @Override
    public AutoVehicle returnMyself() {
        return this;
    }
    /* we can write it in this way too
    @Override
    protected Vehicle returnMyself() {
        return super.returnMyself();
    }
    */

}
